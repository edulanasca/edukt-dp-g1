package com.edukt.grados.primero.ciencia.tecnologia;

import com.edukt.grados.tema.TemaCTA;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("CTA1G")
public class TemaCTAPrimerGrado extends TemaCTA {

  public TemaCTAPrimerGrado() {
    super(1);
  }

  public TemaCTAPrimerGrado(String titulo, String descripcion, List<Seccion> secciones) {
    super(1, titulo, descripcion, secciones);
  }

}
