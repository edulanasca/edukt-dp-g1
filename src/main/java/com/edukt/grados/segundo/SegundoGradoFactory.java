package com.edukt.grados.segundo;

import com.edukt.grados.GradoFactory;
import com.edukt.grados.cursos.*;
import com.edukt.grados.segundo.ciencia.sociales.CursoCienciasSocialesSegundoGrado;
import org.springframework.stereotype.Component;

@Component
public class SegundoGradoFactory implements GradoFactory {
  @Override
  public CursoCienciasSociales getCursoCienciasSociales() {
    return new CursoCienciasSocialesSegundoGrado();
  }

  @Override
  public CursoCTA getCursoCienciaTecnologia() {
    return null;
  }

  @Override
  public CursoComunicacion getComunicacion() {
    return null;
  }

  @Override
  public CursoIngles getIngles() {
    return null;
  }

  @Override
  public CursoMatematica getCursoMatematica() {
    return null;
  }
}
