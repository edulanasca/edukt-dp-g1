package com.edukt.grados.segundo.comunicacion;

import com.edukt.grados.cursos.CursoComunicacion;
import com.edukt.grados.cursos.temas.Tema;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("COM2G")
public class CursoComunicacionSegundoGrado extends CursoComunicacion {
    public CursoComunicacionSegundoGrado(String descripcion, List<Tema> temas) {
        super("Comunicación", descripcion, temas);
    }

    public CursoComunicacionSegundoGrado(String descripcion) {
        super("Comunicación", descripcion);
    }

    public CursoComunicacionSegundoGrado() {
        super("Comunicación", "Curso de Comunicación de Segundo Grado");
    }

}
