package com.edukt.grados.primero.matematica;

import com.edukt.grados.cursos.CursoMatematica;
import com.edukt.grados.cursos.temas.Tema;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("MAT1G")
public class CursoMatematicaPrimerGrado extends CursoMatematica {
  public CursoMatematicaPrimerGrado(String descripcion, List<Tema> temas) {
    super("Matemática", descripcion, temas);
  }

  public CursoMatematicaPrimerGrado(String descripcion) {
    super("Matemática", descripcion);
  }

  public CursoMatematicaPrimerGrado() {
    super("Matemática", "Curso de Matemática de Primer Grado");
  }

}
