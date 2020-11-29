package com.edukt.grados.segundo.ciencia.sociales;

import com.edukt.grados.tema.TemaCienciasSociales;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("CS2G")
public class TemaCienciasSocialesSegundoGrado extends TemaCienciasSociales {

  public TemaCienciasSocialesSegundoGrado() {
    super(2);
  }

  public TemaCienciasSocialesSegundoGrado(String titulo, String descripcion, List<Seccion> secciones) {
    super(2, titulo, descripcion, secciones);
  }

}
