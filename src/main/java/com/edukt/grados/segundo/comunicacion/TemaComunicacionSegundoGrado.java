package com.edukt.grados.segundo.comunicacion;

import com.edukt.grados.tema.TemaComunicacion;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("COM2G")
public class TemaComunicacionSegundoGrado extends TemaComunicacion {

    public TemaComunicacionSegundoGrado() {
        super(2);
    }

    public TemaComunicacionSegundoGrado(String titulo, String descripcion, List<Seccion> secciones) {
        super(2, titulo, descripcion, secciones);
    }

}
