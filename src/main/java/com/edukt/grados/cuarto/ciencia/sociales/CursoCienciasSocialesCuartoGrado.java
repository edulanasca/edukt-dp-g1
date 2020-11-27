package com.edukt.grados.cuarto.ciencia.sociales;

import com.edukt.grados.cursos.CursoCienciasSociales;
import com.edukt.grados.cursos.temas.Tema;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("CS1G")
public class CursoCienciasSocialesCuartoGrado extends CursoCienciasSociales {

    public CursoCienciasSocialesCuartoGrado(String descripcion, List<Tema> temas) {
        super("Ciencias Sociales", descripcion, temas);
    }

    public CursoCienciasSocialesCuartoGrado(String descripcion) {
        super("Ciencias Sociales", descripcion);
    }

    public CursoCienciasSocialesCuartoGrado() {
        super("Ciencias Sociales", "Curso de Ciencias Sociales de Cuarto Grado");
    }
}
