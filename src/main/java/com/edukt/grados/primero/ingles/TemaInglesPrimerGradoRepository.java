package com.edukt.grados.primero.ingles;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "EN1G")
public interface TemaInglesPrimerGradoRepository
    extends MongoRepository<TemaInglesPrimerGrado, String> {
}
