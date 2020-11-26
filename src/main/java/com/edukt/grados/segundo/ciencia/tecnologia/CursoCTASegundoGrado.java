package com.edukt.grados.segundo.ciencia.tecnologia;

import com.edukt.grados.cursos.CursoCTA;
import com.edukt.grados.cursos.temas.Tema;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("CTA2G")
public class CursoCTASegundoGrado extends CursoCTA {
    public CursoCTASegundoGrado(String descripcion, List<Tema> temas) {
        super("Ciencia, Tecnología y Ambiente", descripcion, temas);
    }

    public CursoCTASegundoGrado(String descipcion) {
        super("Ciencia, Tecnología y Ambiente", descipcion);
    }

    public CursoCTASegundoGrado() {
        super("Ciencia, Tecnología y Ambiente", "Curso de Ciencia, Tecnología y Ambiente de Segundo Grado");
    }
}
