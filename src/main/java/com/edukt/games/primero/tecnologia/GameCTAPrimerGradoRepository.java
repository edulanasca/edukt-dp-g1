package com.edukt.games.primero.tecnologia;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "gamesCTA1G")
public interface GameCTAPrimerGradoRepository extends
    MongoRepository<GameCTAPrimerGrado, String> {

  GameCTAPrimerGrado findGameCTAPrimerGradoByTemaId(String temaId);

}
