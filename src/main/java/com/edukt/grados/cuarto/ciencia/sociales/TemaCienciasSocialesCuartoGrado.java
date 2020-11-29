package com.edukt.grados.cuarto.ciencia.sociales;

import com.edukt.grados.tema.TemaCienciasSociales;
import com.edukt.grados.tema.Seccion;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("CS4G")
public class TemaCienciasSocialesCuartoGrado extends TemaCienciasSociales {

    public TemaCienciasSocialesCuartoGrado() {
        super(4);
    }

    public TemaCienciasSocialesCuartoGrado(String titulo, String descripcion, List<Seccion> secciones) {
        super(4, titulo, descripcion, secciones);
    }

}
