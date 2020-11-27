package com.edukt.foro.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
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
}
