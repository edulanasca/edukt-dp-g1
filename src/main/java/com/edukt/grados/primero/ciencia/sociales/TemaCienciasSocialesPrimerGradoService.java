package com.edukt.grados.primero.ciencia.sociales;

import com.edukt.grados.tema.Seccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaCienciasSocialesPrimerGradoService {
  private final TemaCienciasSocialesPrimerGradoRepository socialesPrimerGradoRepository;

  @Autowired
  public TemaCienciasSocialesPrimerGradoService(TemaCienciasSocialesPrimerGradoRepository
                                                      socialesPrimerGradoRepository) {
    this.socialesPrimerGradoRepository = socialesPrimerGradoRepository;
  }

  public TemaCienciasSocialesPrimerGrado saveTema(TemaCienciasSocialesPrimerGrado curso) {
    return this.socialesPrimerGradoRepository.save(curso);
  }

  public TemaCienciasSocialesPrimerGrado agregarSecciones(String id, List<Seccion> secciones) {
    TemaCienciasSocialesPrimerGrado curso = this.getOne(id);
    curso.getSecciones().addAll(secciones);
    return this.socialesPrimerGradoRepository.save(curso);
  }

  public TemaCienciasSocialesPrimerGrado getOne(String id) {
    return this.socialesPrimerGradoRepository.findById(id).orElseThrow(NullPointerException::new);
  }

  public List<TemaCienciasSocialesPrimerGrado> all() {
    return socialesPrimerGradoRepository.findAll();
  }

}
