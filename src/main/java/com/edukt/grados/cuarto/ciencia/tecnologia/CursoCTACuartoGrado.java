package com.edukt.grados.cuarto.ciencia.tecnologia;

import com.edukt.grados.cursos.CursoCTA;
import com.edukt.grados.cursos.temas.Tema;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("CTA4G")
public class CursoCTACuartoGrado extends CursoCTA {
    public CursoCTACuartoGrado(String descripcion, List<Tema> temas) {
        super("Ciencia, Tecnología y Ambiente", descripcion, temas);
    }

    public CursoCTACuartoGrado() {
        super("Ciencia, Tecnología y Ambiente", "Curso de Ciencia, Tecnología y Ambiente de Cuarto Grado");
    }

}
