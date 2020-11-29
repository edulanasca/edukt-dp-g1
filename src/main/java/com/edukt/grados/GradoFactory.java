package com.edukt.grados;

import com.edukt.grados.tema.*;

public interface GradoFactory {
  TemaCienciasSociales getTemaCienciasSociales();
  TemaCTA getTemaCienciaTecnologia();
  TemaComunicacion getTemaComunicacion();
  TemaIngles getTemaIngles();
  TemaMatematica getTemaMatematica();
}
