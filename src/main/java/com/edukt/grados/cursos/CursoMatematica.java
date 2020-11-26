package com.edukt.grados.cursos;

import com.edukt.grados.cursos.temas.Tema;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public abstract class CursoMatematica extends Curso {

  public CursoMatematica(String nombre, String descripcion, List<Tema> temas) {
    super(nombre, descripcion, temas);
  }

  public CursoMatematica(String nombre, String descripcion) {
    super(nombre, descripcion);
  }

}
