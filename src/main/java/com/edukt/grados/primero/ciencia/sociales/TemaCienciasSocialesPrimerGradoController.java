package com.edukt.grados.primero.ciencia.sociales;

import com.edukt.grados.tema.Seccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "CS1G", produces = MediaType.APPLICATION_JSON_VALUE)
public class TemaCienciasSocialesPrimerGradoController {

  private final TemaCienciasSocialesPrimerGradoService service;

  @Autowired
  public TemaCienciasSocialesPrimerGradoController(TemaCienciasSocialesPrimerGradoService service) {
    this.service = service;
  }

  @GetMapping
  public List<TemaCienciasSocialesPrimerGrado> all() {
    return service.all();
  }

  @PostMapping("{id}/secciones")
  public TemaCienciasSocialesPrimerGrado appendSecciones(@RequestBody List<Seccion> secciones,
                                                         @PathVariable String id) {
    return this.service.agregarSecciones(id, secciones);
  }

}
