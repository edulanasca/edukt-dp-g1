package com.edukt.grados.segundo.matematica;

import com.edukt.grados.cursos.CursoMatematica;
import com.edukt.grados.cursos.temas.Tema;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("MAT2G")
public class CursoMatematicaSegundoGrado extends CursoMatematica {
    public CursoMatematicaSegundoGrado(String descripcion, List<Tema> temas) {
        super("Matemática", descripcion, temas);
    }

    public CursoMatematicaSegundoGrado(String descripcion) {
        super("Matemática", descripcion);
    }

    public CursoMatematicaSegundoGrado() {
        super("Matemática", "Curso de Matemática de Segundo Grado");
    }
}
