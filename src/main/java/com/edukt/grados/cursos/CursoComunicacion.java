package com.edukt.grados.cursos;

import com.edukt.grados.cursos.temas.Tema;

import java.util.List;

public abstract class CursoComunicacion extends Curso {
  public CursoComunicacion(String id, String nombre, String descripcion, List<Tema> temas) {
    super(id, nombre, descripcion, temas);
  }

  public CursoComunicacion() {
  }

  public CursoComunicacion(String nombre, String descripcion, List<Tema> temas) {
    super(nombre, descripcion, temas);
  }

  public CursoComunicacion(String nombre, String descripcion) {
    super(nombre, descripcion);
  }
}
