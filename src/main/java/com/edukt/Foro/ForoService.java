package com.edukt.foro;

import com.edukt.foro.builder.ComentarioBuilder;
import com.edukt.foro.builder.PublicacionBuilder;
import com.edukt.foro.model.Comentario;
import com.edukt.foro.model.Foro;
import com.edukt.foro.model.Publicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ForoService {

  private final PublicacionRepository publicacionRepository;

  @Autowired
  public ForoService(PublicacionRepository publicacionRepository) {
    this.publicacionRepository = publicacionRepository;
  }

  public Publicacion addPublicacion(Map<String, Object> json) {

    PublicacionBuilder publicacion = new PublicacionBuilder();

    return this.publicacionRepository.save(publicacion
        .conAutor((String) json.get("autor"))
        .conGrado((Integer) json.get("grado"))
        .conCurso((String) json.get("curso"))
        .conTitulo((String) json.get("titulo"))
        .conTexto((String) json.get("texto"))
        .build());
  }

  public List<Publicacion> allPublicaciones() {
    return this.publicacionRepository.findAll();
  }

  public Publicacion buscarPublicacion(String id) throws NullPointerException {
    return this.publicacionRepository.findById(id).orElseThrow(NullPointerException::new);
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
    this.publicacionRepository.insert(publicacion);

    return comentario;
  }

  public Comentario buscarComentario(String uuid) throws NullPointerException {

    Foro foro = this.publicacionRepository.findByComentarioId(uuid).orElseThrow(NullPointerException::new);
    ComentarioBuilder builder = new ComentarioBuilder();
    return builder
        .conId(uuid)
        .conAutor(foro.getAutor())
        .conTexto(foro.getTexto())
        .conFechaHora(foro.getFechaPub())
        .build();
  }

}
