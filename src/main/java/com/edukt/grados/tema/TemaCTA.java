package com.edukt.grados.tema;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public abstract class TemaCTA extends Tema {

  public TemaCTA(int grado, String titulo, String descripcion, List<Seccion> secciones) {
    super("Ciencia, Tecnología y Ambiente", grado, titulo, descripcion, secciones);
  }

  public TemaCTA(int grado) {
    super("Ciencia, Tecnología y Ambiente", grado);
  }
}
