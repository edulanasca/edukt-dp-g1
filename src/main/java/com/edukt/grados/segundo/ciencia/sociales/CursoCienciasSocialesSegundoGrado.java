package com.edukt.grados.segundo.ciencia.sociales;

import com.edukt.grados.cursos.CursoCienciasSociales;
import com.edukt.grados.cursos.temas.Tema;

import java.util.List;

public class CursoCienciasSocialesSegundoGrado extends CursoCienciasSociales {
  public CursoCienciasSocialesSegundoGrado(String nombre, String descripcion, List<Tema> temas) {
    super("Ciencias Sociales", descripcion, temas);
  }

  public CursoCienciasSocialesSegundoGrado(String descripcion) {
    super("Ciencias Sociales", descripcion);
  }

  public CursoCienciasSocialesSegundoGrado() {
    super("Ciencias Sociales", "Curso de Ciencias Sociales de Segundo Grado");
  }
}
