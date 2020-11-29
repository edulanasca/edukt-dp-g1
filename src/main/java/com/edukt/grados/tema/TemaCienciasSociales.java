package com.edukt.grados.tema;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public abstract class TemaCienciasSociales extends Tema {

  public TemaCienciasSociales(int grado, String titulo, String descripcion, List<Seccion> secciones) {
    super("Ciencias Sociales", grado, titulo, descripcion, secciones);
  }

  public TemaCienciasSociales(int grado) {
    super("Ciencias Sociales", grado);
  }
}
