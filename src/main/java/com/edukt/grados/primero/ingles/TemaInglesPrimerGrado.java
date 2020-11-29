package com.edukt.grados.primero.ingles;

import com.edukt.grados.tema.TemaIngles;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("EN1G")
public class TemaInglesPrimerGrado extends TemaIngles {

  public TemaInglesPrimerGrado() {
    super(1);
  }

  public TemaInglesPrimerGrado(String titulo, String descripcion, List<Seccion> secciones) {
    super(1, titulo, descripcion, secciones);
  }

}
