package com.edukt.grados.segundo;

import com.edukt.grados.GradoFactory;
import com.edukt.grados.tema.*;
import com.edukt.grados.segundo.ciencia.sociales.TemaCienciasSocialesSegundoGrado;
import com.edukt.grados.segundo.ciencia.tecnologia.TemaCTASegundoGrado;
import com.edukt.grados.segundo.comunicacion.TemaComunicacionSegundoGrado;
import com.edukt.grados.segundo.ingles.TemaInglesSegundoGrado;
import com.edukt.grados.segundo.matematica.TemaMatematicaSegundoGrado;
import org.springframework.stereotype.Component;

@Component
public class SegundoGradoFactory implements GradoFactory {
  @Override
  public TemaCienciasSociales getTemaCienciasSociales() {
    return new TemaCienciasSocialesSegundoGrado();
  }

  @Override
  public TemaCTA getTemaCienciaTecnologia() {
    return new TemaCTASegundoGrado();
  }

  @Override
  public TemaComunicacion getTemaComunicacion() {
    return new TemaComunicacionSegundoGrado();
  }

  @Override
  public TemaIngles getTemaIngles() {
    return new TemaInglesSegundoGrado();
  }

  @Override
  public TemaMatematica getTemaMatematica() {
    return new TemaMatematicaSegundoGrado();
  }
}
