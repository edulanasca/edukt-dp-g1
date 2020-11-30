package com.edukt.foro;

import com.edukt.foro.builder.ComentarioBuilder;
import com.edukt.foro.model.Comentario;
import com.edukt.foro.model.Foro;
import com.edukt.foro.model.Publicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ForoService {

  private final PublicacionRepository publicacionRepository;

  @Autowired
  public ForoService(PublicacionRepository publicacionRepository) {
    this.publicacionRepository = publicacionRepository;
  }

  public Publicacion addPublicacion(Publicacion publicacion) {

    publicacion.setComentarios(publicacion
        .getComentarios()
        .stream()
        .map(e -> new ComentarioBuilder()
            .conAutor(e.getAutor())
            .conTexto(e.getTexto())
            .conFechaHora(e.getFechaPub())
            .build())
        .collect(Collectors.toList()));

    return this.publicacionRepository.save(publicacion);
  }

  public List<Publicacion> allPublicaciones() {
    return this.publicacionRepository.findAll();
  }

  public Publicacion buscarPublicacion(String id) throws NullPointerException {
    return this.publicacionRepository.findById(id).orElseThrow(NullPointerException::new).buscar(id);
  }

  public Publicacion updatePublicacion(Publicacion publicacion) {
    return this.publicacionRepository.save(publicacion);
  }

  public void deletePublicacion(String id) throws NullPointerException {
    this.publicacionRepository.delete(buscarPublicacion(id));
  }

  public Comentario addComentario(String idPublicacion, Comentario comentario) throws NullPointerException {

    Publicacion publicacion = buscarPublicacion(idPublicacion);
    publicacion.agregarComentario(comentario);
    this.publicacionRepository.save(publicacion);

    return comentario;
  }

  public Comentario buscarComentario(String uuid) throws NullPointerException {

    Foro foro = this.publicacionRepository.findByComentarioId(uuid).orElseThrow(NullPointerException::new);
    return new ComentarioBuilder()
        .conId(uuid)
        .conAutor(foro.getAutor())
        .conTexto(foro.getTexto())
        .conFechaHora(foro.getFechaPub())
        .build();
  }

}
