package com.edukt.foro.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonTypeName("pub")
@ApiModel(value = "Publicación", description = "Publicación del Foro.")
public class Publicacion extends Foro {

  @Id
  private String id;
  private String titulo;
  private int grado;
  private String curso;
  private List<Foro> comentarios;

  public Publicacion() {
    super();
    this.comentarios = new ArrayList<>();
  }

  public void agregarComentario(Comentario comentario) {
    comentarios.add(comentario);
  }

  /**
   * Realiza un busqueda en amplitud en los diferentes elementos del Foro
   * @param id El id de la publicación a buscar
   * @return Si la publicacion no existe retorna <code>null</code> caso contrario la publicación a buscar
   */
  public Publicacion buscar(String id) {

    if (this.id.equals(id)) {
      return this;
    }

    for (Foro f : this.comentarios) {
      if (f instanceof Publicacion) {
        return (Publicacion) f.buscar(id);
      }
    }

    return null;
  }

}
