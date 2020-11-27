package com.edukt.grados.cuarto.matematica;

import com.edukt.grados.cursos.CursoMatematica;
import com.edukt.grados.cursos.temas.Tema;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("MAT1G")
public class CursoMatematicaCuartoGrado extends CursoMatematica {
    public CursoMatematicaCuartoGrado(String descripcion, List<Tema> temas) {
        super("Matemática", descripcion, temas);
    }

    public CursoMatematicaCuartoGrado(String descripcion) {
        super("Matemática", descripcion);
    }

    public CursoMatematicaCuartoGrado() {
        super("Matemática", "Curso de Matemática de Primer Grado");
    }

}

