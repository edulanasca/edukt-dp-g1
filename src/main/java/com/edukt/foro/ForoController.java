package com.edukt.foro;

import com.edukt.api.ApiResponse;
import com.edukt.foro.model.Comentario;
import com.edukt.foro.model.Publicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@CrossOrigin
@RestController
@RequestMapping(value = "/foro", produces = MediaType.APPLICATION_JSON_VALUE)
public class ForoController {

  private final ForoService foroService;

  @Autowired
  public ForoController(ForoService foroService) {
    this.foroService = foroService;
  }

  @PostMapping("/publicaciones")
  public ResponseEntity<ApiResponse> addPublicacion(@RequestBody Publicacion publicacion) {
    Publicacion p = foroService.addPublicacion(publicacion);
    return ResponseEntity
        .created(URI.create("/foro/publicaciones/" + p.getId()))
        .body(new ApiResponse(ApiResponse.Tipo.SUCCESS, p));
  }

  @GetMapping("/publicaciones")
  public ResponseEntity<ApiResponse> allPublicaciones() {
    return ResponseEntity.ok(new ApiResponse(ApiResponse.Tipo.SUCCESS, foroService.allPublicaciones()));
  }

  @GetMapping("/publicaciones/{id}")
  public ResponseEntity<ApiResponse> getPublicacion(@PathVariable String id) {

    try {
      Publicacion p = this.foroService.buscarPublicacion(id);
      return ResponseEntity
          .ok(new ApiResponse(ApiResponse.Tipo.SUCCESS, p));
    } catch (NullPointerException ex) {
      return ResponseEntity
          .badRequest()
          .body(new ApiResponse(ApiResponse.Tipo.FAILURE, "Ops! La publicacion con id " + id + " no existe"));
    }
  }

  @PutMapping("/publicaciones")
  public ResponseEntity<ApiResponse> updatePublicacion(@RequestBody Publicacion publicacion) {
    return ResponseEntity
        .ok(new ApiResponse(ApiResponse.Tipo.SUCCESS, this.foroService.updatePublicacion(publicacion)));
  }

  @DeleteMapping("/publicaciones/{id}")
  public ResponseEntity<ApiResponse> deletePublicacion(@PathVariable String id) {

    try {
      this.foroService.deletePublicacion(id);
      return ResponseEntity
          .ok(new ApiResponse(ApiResponse.Tipo.SUCCESS, null));
    } catch (NullPointerException ex) {
      return ResponseEntity
          .badRequest()
          .body(new ApiResponse(ApiResponse.Tipo.FAILURE, "Ops! La publicacion con id " + id + " no existe"));
    }
  }

  @PostMapping("/{idPublicacion}/comentarios")
  public ResponseEntity<ApiResponse> addComentario(@RequestBody Comentario comentario,
                                                   @PathVariable String idPublicacion) {

    try {
      Comentario c = foroService.addComentario(idPublicacion, comentario);
      return ResponseEntity
          .created(URI.create("/foro/comentarios/" + c.getUuid()))
          .body(new ApiResponse(ApiResponse.Tipo.SUCCESS, c));
    } catch (NullPointerException ex) {
      return ResponseEntity
          .badRequest()
          .body(new ApiResponse(ApiResponse.Tipo.FAILURE, "Ops! El comentario no pudo ser agregado. " +
              "La publicacion con id " + idPublicacion + " no existe"));
    }
  }

  @GetMapping("/comentarios/{uuid}")
  public ResponseEntity<ApiResponse> buscarComentario(@PathVariable String uuid) {

    try {
      Comentario c = this.foroService.buscarComentario(uuid);
      return ResponseEntity
          .ok(new ApiResponse(ApiResponse.Tipo.SUCCESS, c));
    } catch (NullPointerException ex) {
      return ResponseEntity
          .badRequest()
          .body(new ApiResponse(ApiResponse.Tipo.FAILURE, "Ops! El comentario con Id " + uuid + "no existe."));
    }
  }
}
