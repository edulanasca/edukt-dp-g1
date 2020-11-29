package com.edukt.grados.primero;

import com.edukt.grados.GradoFactory;
import com.edukt.grados.tema.*;
import com.edukt.grados.primero.ciencia.tecnologia.TemaCTAPrimerGrado;
import com.edukt.grados.primero.ciencia.sociales.TemaCienciasSocialesPrimerGrado;
import com.edukt.grados.primero.comunicacion.TemaComunicacionPrimerGrado;
import com.edukt.grados.primero.ingles.TemaInglesPrimerGrado;
import com.edukt.grados.primero.matematica.TemaMatematicaPrimerGrado;
import org.springframework.stereotype.Component;

@Component
public class PrimerGradoFactory implements GradoFactory {
  @Override
  public TemaCienciasSociales getTemaCienciasSociales() {
    return new TemaCienciasSocialesPrimerGrado();
  }

  @Override
  public TemaCTA getTemaCienciaTecnologia() {
    return new TemaCTAPrimerGrado();
  }

  @Override
  public TemaComunicacion getTemaComunicacion() {
    return new TemaComunicacionPrimerGrado();
  }

  @Override
  public TemaIngles getTemaIngles() {
    return new TemaInglesPrimerGrado();
  }

  @Override
  public TemaMatematica getTemaMatematica() {
    return new TemaMatematicaPrimerGrado();
  }
}
