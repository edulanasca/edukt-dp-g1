package com.edukt.grados.cuarto;

import com.edukt.grados.GradoFactory;
import com.edukt.grados.tema.*;
import com.edukt.grados.cuarto.ciencia.tecnologia.TemaCTACuartoGrado;
import com.edukt.grados.cuarto.ciencia.sociales.TemaCienciasSocialesCuartoGrado;
import com.edukt.grados.cuarto.comunicacion.TemaComunicacionCuartoGrado;
import com.edukt.grados.cuarto.ingles.TemaInglesCuartoGrado;
import com.edukt.grados.cuarto.matematica.TemaMatematicaCuartoGrado;
import org.springframework.stereotype.Component;

@Component
public class CuartoGradoFactory implements GradoFactory {
    @Override
    public TemaCienciasSociales getTemaCienciasSociales() {
        return new TemaCienciasSocialesCuartoGrado();
    }

    @Override
    public TemaCTA getTemaCienciaTecnologia() {
        return new TemaCTACuartoGrado();
    }

    @Override
    public TemaComunicacion getTemaComunicacion() {
        return new TemaComunicacionCuartoGrado();
    }

    @Override
    public TemaIngles getTemaIngles() {
        return new TemaInglesCuartoGrado();
    }

    @Override
    public TemaMatematica getTemaMatematica() {
        return new TemaMatematicaCuartoGrado();
    }
}
