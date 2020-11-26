package com.edukt.grados.primero.comunicacion;

import com.edukt.grados.cursos.CursoComunicacion;
import com.edukt.grados.cursos.temas.Tema;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("COMG1")
public class CursoComunicacionPrimerGrado extends CursoComunicacion {
  public CursoComunicacionPrimerGrado(String descripcion, List<Tema> temas) {
    super("Comunicación", descripcion, temas);
  }

  public CursoComunicacionPrimerGrado() {
    super("Comunicación", "Curso de Comunicación de Primer Grado");
  }

}
