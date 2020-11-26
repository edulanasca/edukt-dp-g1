package com.edukt.grados.primero.ciencia.sociales;

import com.edukt.grados.cursos.CursoCienciasSociales;
import com.edukt.grados.cursos.temas.Tema;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("CS1G")
public class CursoCienciasSocialesPrimerGrado extends CursoCienciasSociales {

  public CursoCienciasSocialesPrimerGrado(String descripcion, List<Tema> temas) {
    super("Ciencias Sociales", descripcion, temas);
  }

  public CursoCienciasSocialesPrimerGrado(String descripcion) {
    super("Ciencias Sociales", descripcion);
  }

  public CursoCienciasSocialesPrimerGrado() {
    super("Ciencias Sociales", "Curso de Ciencias Sociales de Primer Grado");
  }
}
