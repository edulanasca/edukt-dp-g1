package com.edukt.grados;

import com.edukt.grados.cursos.*;

public interface GradoFactory {
  CursoCienciasSociales getCursoCienciasSociales();
  CursoCTA getCursoCienciaTecnologia();
  CursoComunicacion getComunicacion();
  CursoIngles getIngles();
  CursoMatematica getCursoMatematica();
}
