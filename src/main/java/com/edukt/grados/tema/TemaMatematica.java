package com.edukt.grados.tema;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public abstract class TemaMatematica extends Tema {

  public TemaMatematica(int grado, String titulo, String descripcion, List<Seccion> secciones) {
    super("Matemática", grado, titulo, descripcion, secciones);
  }

  public TemaMatematica(int grado) {
    super("Matemática", grado);
  }
}
