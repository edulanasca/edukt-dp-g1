package com.edukt.grados.cuarto.ingles;

import com.edukt.grados.tema.TemaIngles;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("EN4G")
public class TemaInglesCuartoGrado extends TemaIngles {

    public TemaInglesCuartoGrado() {
        super(4);
    }

    public TemaInglesCuartoGrado(String titulo, String descripcion, List<Seccion> secciones) {
        super(4, titulo, descripcion, secciones);
    }

}
