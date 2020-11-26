package com.edukt.grados.segundo;

import com.edukt.grados.GradoFactory;
import com.edukt.grados.cursos.*;
import com.edukt.grados.segundo.ciencia.sociales.CursoCienciasSocialesSegundoGrado;
import com.edukt.grados.segundo.ciencia.tecnologia.CursoCTASegundoGrado;
import com.edukt.grados.segundo.comunicacion.CursoComunicacionSegundoGrado;
import com.edukt.grados.segundo.ingles.CursoInglesSegundoGrado;
import com.edukt.grados.segundo.matematica.CursoMatematicaSegundoGrado;
import org.springframework.stereotype.Component;

@Component
public class SegundoGradoFactory implements GradoFactory {
  @Override
  public CursoCienciasSociales getCursoCienciasSociales() {
    return new CursoCienciasSocialesSegundoGrado();
  }

  @Override
  public CursoCTA getCursoCienciaTecnologia() {
    return new CursoCTASegundoGrado();
  }

  @Override
  public CursoComunicacion getComunicacion() {
    return new CursoComunicacionSegundoGrado();
  }

  @Override
  public CursoIngles getIngles() {
    return new CursoInglesSegundoGrado();
  }

  @Override
  public CursoMatematica getCursoMatematica() {
    return new CursoMatematicaSegundoGrado();
  }
}
