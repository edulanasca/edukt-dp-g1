package com.edukt.grados.primero.ciencia.sociales;

import com.edukt.grados.tema.TemaCienciasSociales;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("CS1G")
public class TemaCienciasSocialesPrimerGrado extends TemaCienciasSociales {

  public TemaCienciasSocialesPrimerGrado() {
    super(1);
  }

  public TemaCienciasSocialesPrimerGrado(String titulo, String descripcion, List<Seccion> secciones) {
    super(1, titulo, descripcion, secciones);
  }

}
