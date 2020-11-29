package com.edukt.grados.segundo.ciencia.tecnologia;

import com.edukt.grados.tema.TemaCTA;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("CTA2G")
public class TemaCTASegundoGrado extends TemaCTA {

    public TemaCTASegundoGrado() {
        super(2);
    }

    public TemaCTASegundoGrado(String titulo, String descripcion, List<Seccion> secciones) {
        super(2, titulo, descripcion, secciones);
    }

}
