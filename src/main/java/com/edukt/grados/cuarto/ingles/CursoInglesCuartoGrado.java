package com.edukt.grados.cuarto.ingles;

import com.edukt.grados.cursos.CursoIngles;
import com.edukt.grados.cursos.temas.Tema;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("EN4G")
public class CursoInglesCuartoGrado extends CursoIngles {

    public CursoInglesCuartoGrado(String descripcion, List<Tema> temas) {
        super("Inglés", descripcion, temas);
    }

    public CursoInglesCuartoGrado() {
        super("Inglés", "Curso de Inglés de Cuarto Grado");
    }
}
