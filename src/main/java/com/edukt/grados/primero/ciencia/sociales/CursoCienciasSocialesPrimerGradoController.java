package com.edukt.grados.primero.ciencia.sociales;

import com.edukt.grados.cursos.temas.Tema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "cursos/c_sociales/1", produces = MediaType.APPLICATION_JSON_VALUE)
public class CursoCienciasSocialesPrimerGradoController {

  private final CursoCienciasSocialesPrimerGradoService service;

  @Autowired
  public CursoCienciasSocialesPrimerGradoController(CursoCienciasSocialesPrimerGradoService service) {
    this.service = service;
  }

  @GetMapping
  public List<CursoCienciasSocialesPrimerGrado> all() {
    return service.all();
  }

  @PostMapping("/temas")
  public CursoCienciasSocialesPrimerGrado saveTemas(@RequestBody List<Tema> temas) {
    return service.saveTemas(temas);
  }

}
