package com.edukt.grados.cuarto.comunicacion;

import com.edukt.grados.tema.TemaComunicacion;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("COM4G")
public class TemaComunicacionCuartoGrado extends TemaComunicacion {

    public TemaComunicacionCuartoGrado() {
        super(4);
    }

    public TemaComunicacionCuartoGrado(String titulo, String descripcion, List<Seccion> secciones) {
        super(4, titulo, descripcion, secciones);
    }

}
