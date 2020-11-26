package com.edukt.grados.cursos;

import com.edukt.grados.cursos.temas.Tema;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public abstract class CursoIngles extends Curso {
  public CursoIngles(String nombre, String descripcion, List<Tema> temas) {
    super(nombre, descripcion, temas);
  }

  public CursoIngles(String nombre, String descripcion) {
    super(nombre, descripcion);
  }
}
