package com.edukt.grados.primero.matematica;

import com.edukt.grados.tema.TemaMatematica;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("MAT1G")
public class TemaMatematicaPrimerGrado extends TemaMatematica {

  public TemaMatematicaPrimerGrado() {
    super(1);
  }

  public TemaMatematicaPrimerGrado(String titulo, String descripcion, List<Seccion> secciones) {
    super(1, titulo, descripcion, secciones);
  }

}
