package com.edukt.grados.tema;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public abstract class TemaIngles extends Tema {

  public TemaIngles(int grado, String titulo, String descripcion, List<Seccion> secciones) {
    super("Inglés", grado, titulo, descripcion, secciones);
  }

  public TemaIngles(int grado) {
    super("Inglés", grado);
  }
}
