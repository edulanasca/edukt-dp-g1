package com.edukt.grados.primero.ciencia.tecnologia;

import com.edukt.grados.cursos.CursoCTA;
import com.edukt.grados.cursos.temas.Tema;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("CTA1G")
public class CursoCTAPrimerGrado extends CursoCTA {
  public CursoCTAPrimerGrado(String descripcion, List<Tema> temas) {
    super("Ciencia, Tecnología y Ambiente", descripcion, temas);
  }

  public CursoCTAPrimerGrado() {
    super("Ciencia, Tecnología y Ambiente", "Curso de Ciencia, Tecnología y Ambiente de Primer Grado");
  }

}
