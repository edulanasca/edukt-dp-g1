package com.edukt.grados.segundo.ingles;

import com.edukt.grados.cursos.CursoIngles;
import com.edukt.grados.cursos.temas.Tema;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("EN2G")
public class CursoInglesSegundoGrado extends CursoIngles {
    public CursoInglesSegundoGrado (String descripcion, List<Tema> temas) {
        super("Inglés", descripcion, temas);
    }

    public CursoInglesSegundoGrado(String descripcion) {
        super("Inglés", descripcion);
    }

    public CursoInglesSegundoGrado() {
        super("Inglés", "Curso de Inglés de Segundo Grado");
    }
}
