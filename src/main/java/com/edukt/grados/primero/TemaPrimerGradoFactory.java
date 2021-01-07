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
public class TemaPrimerGradoFactory implements GradoFactory {
  @Override
  public TemaCienciasSociales getCienciasSociales() {
    return new TemaCienciasSocialesPrimerGrado();
  }

  @Override
  public TemaCTA getCienciaTecnologia() {
    return new TemaCTAPrimerGrado();
  }

  @Override
  public TemaComunicacion getComunicacion() {
    return new TemaComunicacionPrimerGrado();
  }

  @Override
  public TemaIngles getIngles() {
    return new TemaInglesPrimerGrado();
  }

  @Override
  public TemaMatematica getMatematica() {
    return new TemaMatematicaPrimerGrado();
  }
}
