package com.edukt.grados;

import com.edukt.grados.tema.*;

public interface GradoFactory {
  TemaCienciasSociales getCienciasSociales();
  TemaCTA getCienciaTecnologia();
  TemaComunicacion getComunicacion();
  TemaIngles getIngles();
  TemaMatematica getMatematica();
}
