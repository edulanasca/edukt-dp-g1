package com.edukt.foro;

import com.edukt.foro.model.Foro;
import com.edukt.foro.model.Publicacion;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@CrossOrigin
@RepositoryRestResource(path = "publicaciones")
public interface PublicacionRepository
    extends MongoRepository<Publicacion, String> {

  @ApiOperation("Busca el comentario con el UUID dado")
  @RestResource(path = "comentario")
  @Query("{'comentarios.uuid': ?0 }")
  Optional<Foro> findByComentarioId(String uuid);
}
