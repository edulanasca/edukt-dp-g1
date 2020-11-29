package com.edukt.grados.primero.comunicacion;

import com.edukt.grados.tema.TemaComunicacion;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("COM1G")
public class TemaComunicacionPrimerGrado extends TemaComunicacion {

  public TemaComunicacionPrimerGrado() {
    super(1);
  }

  public TemaComunicacionPrimerGrado(String titulo, String descripcion, List<Seccion> secciones) {
    super(1, titulo, descripcion, secciones);
  }
}
