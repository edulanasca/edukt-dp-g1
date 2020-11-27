package com.edukt.grados.cuarto;

import com.edukt.grados.GradoFactory;
import com.edukt.grados.cursos.*;
import com.edukt.grados.cuarto.ciencia.tecnologia.CursoCTACuartoGrado;
import com.edukt.grados.cuarto.ciencia.sociales.CursoCienciasSocialesCuartoGrado;
import com.edukt.grados.cuarto.comunicacion.CursoComunicacionCuartoGrado;
import com.edukt.grados.cuarto.ingles.CursoInglesCuartoGrado;
import com.edukt.grados.cuarto.matematica.CursoMatematicaCuartoGrado;
import org.springframework.stereotype.Component;

@Component
public class CuartoGradoFactory implements GradoFactory {
    @Override
    public CursoCienciasSociales getCursoCienciasSociales() {
        return new CursoCienciasSocialesCuartoGrado();
    }

    @Override
    public CursoCTA getCursoCienciaTecnologia() {
        return new CursoCTACuartoGrado();
    }

    @Override
    public CursoComunicacion getComunicacion() {
        return new CursoComunicacionCuartoGrado();
    }

    @Override
    public CursoIngles getIngles() {
        return new CursoInglesCuartoGrado();
    }

    @Override
    public CursoMatematica getCursoMatematica() {
        return new CursoMatematicaCuartoGrado();
    }
}
