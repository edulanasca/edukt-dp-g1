package com.edukt.grados.cuarto.comunicacion;

import com.edukt.grados.cursos.CursoComunicacion;
import com.edukt.grados.cursos.temas.Tema;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("COM4G")
public class CursoComunicacionCuartoGrado extends CursoComunicacion {
    public CursoComunicacionCuartoGrado(String descripcion, List<Tema> temas) {
        super("Comunicación", descripcion, temas);
    }

    public CursoComunicacionCuartoGrado() {
        super("Comunicación", "Curso de Comunicación de Cuarto Grado");
    }

}
