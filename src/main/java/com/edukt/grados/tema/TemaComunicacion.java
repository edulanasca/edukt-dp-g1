package com.edukt.grados.tema;

import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public abstract class TemaComunicacion extends Tema {

  public TemaComunicacion(int grado, String titulo, String descripcion, List<Seccion> secciones) {
    super("Comunicación", grado, titulo, descripcion, secciones);
  }

  public TemaComunicacion(int grado) {
    super("Comunicación", grado);
  }
}

