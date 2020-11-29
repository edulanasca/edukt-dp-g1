package com.edukt.grados.cuarto.ciencia.tecnologia;

import com.edukt.grados.tema.TemaCTA;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("CTA4G")
public class TemaCTACuartoGrado extends TemaCTA {

    public TemaCTACuartoGrado() {
        super(4);
    }

    public TemaCTACuartoGrado(String titulo, String descripcion, List<Seccion> secciones) {
        super(4, titulo, descripcion, secciones);
    }

}
