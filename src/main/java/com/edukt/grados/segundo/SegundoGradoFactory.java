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
  public TemaCienciasSociales getCienciasSociales() {
    return new TemaCienciasSocialesSegundoGrado();
  }

  @Override
  public TemaCTA getCienciaTecnologia() {
    return new TemaCTASegundoGrado();
  }

  @Override
  public TemaComunicacion getComunicacion() {
    return new TemaComunicacionSegundoGrado();
  }

  @Override
  public TemaIngles getIngles() {
    return new TemaInglesSegundoGrado();
  }

  @Override
  public TemaMatematica getMatematica() {
    return new TemaMatematicaSegundoGrado();
  }
}
