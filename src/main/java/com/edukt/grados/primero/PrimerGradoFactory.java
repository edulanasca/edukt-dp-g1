package com.edukt.grados.primero;

import com.edukt.grados.GradoFactory;
import com.edukt.grados.cursos.*;
import com.edukt.grados.primero.ciencia.tecnologia.CursoCTAPrimerGrado;
import com.edukt.grados.primero.ciencia.sociales.CursoCienciasSocialesPrimerGrado;
import com.edukt.grados.primero.comunicacion.CursoComunicacionPrimerGrado;
import com.edukt.grados.primero.ingles.CursoInglesPrimerGrado;
import com.edukt.grados.primero.matematica.CursoMatematicaPrimerGrado;
import org.springframework.stereotype.Component;

@Component
public class PrimerGradoFactory implements GradoFactory {
  @Override
  public CursoCienciasSociales getCursoCienciasSociales() {
    return new CursoCienciasSocialesPrimerGrado();
  }

  @Override
  public CursoCTA getCursoCienciaTecnologia() {
    return new CursoCTAPrimerGrado();
  }

  @Override
  public CursoComunicacion getComunicacion() {
    return new CursoComunicacionPrimerGrado();
  }

  @Override
  public CursoIngles getIngles() {
    return new CursoInglesPrimerGrado();
  }

  @Override
  public CursoMatematica getCursoMatematica() {
    return new CursoMatematicaPrimerGrado();
  }
}
