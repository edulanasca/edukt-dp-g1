package com.edukt.foro;

import com.edukt.foro.model.Foro;
import com.edukt.foro.model.Publicacion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface PublicacionRepository
    extends MongoRepository<Publicacion, String> {

  @Query("{'comentarios.uuid': ?0 }")
  Optional<Foro> findByComentarioId(String uuid);
}
