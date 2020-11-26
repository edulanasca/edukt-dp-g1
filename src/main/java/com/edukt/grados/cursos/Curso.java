package com.edukt.grados.cursos;

import com.edukt.grados.cursos.temas.Tema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Curso {

  @Id private String id;
  private String nombre;
  private String descripcion;
  private List<Tema> temas;

  public Curso(String nombre, String descripcion, List<Tema> temas) {
    this(null, nombre, descripcion, temas);
  }

  public Curso(String nombre, String descripcion) {
    this(null, nombre, descripcion, null);
  }

}
