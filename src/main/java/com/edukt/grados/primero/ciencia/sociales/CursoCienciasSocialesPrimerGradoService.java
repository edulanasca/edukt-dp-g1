package com.edukt.grados.primero.ciencia.sociales;

import com.edukt.grados.cursos.CursoCienciasSociales;
import com.edukt.grados.cursos.temas.Tema;
import com.edukt.grados.primero.PrimerGradoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoCienciasSocialesPrimerGradoService {
  private final CursoCienciasSocialesPrimerGradoRepository socialesPrimerGradoRepository;
  private final PrimerGradoFactory primerGradoFactory;

  @Autowired
  public CursoCienciasSocialesPrimerGradoService(
      CursoCienciasSocialesPrimerGradoRepository socialesPrimerGradoRepository,
      PrimerGradoFactory primerGradoFactory) {
    this.socialesPrimerGradoRepository = socialesPrimerGradoRepository;
    this.primerGradoFactory = primerGradoFactory;
  }

  public CursoCienciasSocialesPrimerGrado saveCurso(CursoCienciasSocialesPrimerGrado curso) {
    return this.socialesPrimerGradoRepository.save(curso);
  }

  public CursoCienciasSocialesPrimerGrado saveTemas(List<Tema> temas) {
    CursoCienciasSociales curso = primerGradoFactory.getCursoCienciasSociales();
    curso.setTemas(temas);
    return socialesPrimerGradoRepository.insert((CursoCienciasSocialesPrimerGrado) curso);
  }

  public List<CursoCienciasSocialesPrimerGrado> all() {
    return socialesPrimerGradoRepository.findAll();
  }

}
