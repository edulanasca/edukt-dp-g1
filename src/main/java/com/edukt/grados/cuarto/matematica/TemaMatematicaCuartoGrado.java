package com.edukt.grados.cuarto.matematica;

import com.edukt.grados.tema.TemaMatematica;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("MAT4G")
public class TemaMatematicaCuartoGrado extends TemaMatematica {

    public TemaMatematicaCuartoGrado() {
        super(4);
    }

    public TemaMatematicaCuartoGrado(String titulo, String descripcion, List<Seccion> secciones) {
        super(4, titulo, descripcion, secciones);
    }

}

