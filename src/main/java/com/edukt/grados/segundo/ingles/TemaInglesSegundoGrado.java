package com.edukt.grados.segundo.ingles;

import com.edukt.grados.tema.TemaIngles;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("EN2G")
public class TemaInglesSegundoGrado extends TemaIngles {

    public TemaInglesSegundoGrado() {
        super(2);
    }

    public TemaInglesSegundoGrado(String titulo, String descripcion, List<Seccion> secciones) {
        super(2, titulo, descripcion, secciones);
    }

}
