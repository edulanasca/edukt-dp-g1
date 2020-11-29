package com.edukt.grados.segundo.matematica;

import com.edukt.grados.tema.TemaMatematica;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("MAT2G")
public class TemaMatematicaSegundoGrado extends TemaMatematica {

    public TemaMatematicaSegundoGrado() {
        super(2);
    }

    public TemaMatematicaSegundoGrado(String titulo, String descripcion, List<Seccion> secciones) {
        super(2, titulo, descripcion, secciones);
    }

}
