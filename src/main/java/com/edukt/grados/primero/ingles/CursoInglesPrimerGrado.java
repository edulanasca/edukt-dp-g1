package com.edukt.grados.primero.ingles;

import com.edukt.grados.cursos.CursoIngles;
import com.edukt.grados.cursos.temas.Tema;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("EN1G")
public class CursoInglesPrimerGrado extends CursoIngles {

  public CursoInglesPrimerGrado(String descripcion, List<Tema> temas) {
    super("Inglés", descripcion, temas);

  }

  public CursoInglesPrimerGrado(String descripcion) {
    super("Inglés", descripcion);

  }

  public CursoInglesPrimerGrado() {
    super("Inglés", "Curso de Inglés de Primer Grado");

  }
}
