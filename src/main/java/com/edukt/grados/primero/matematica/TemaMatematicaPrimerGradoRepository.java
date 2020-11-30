package com.edukt.grados.primero.matematica;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "MAT1G")
public interface TemaMatematicaPrimerGradoRepository
    extends MongoRepository<TemaMatematicaPrimerGrado, String> {
}
