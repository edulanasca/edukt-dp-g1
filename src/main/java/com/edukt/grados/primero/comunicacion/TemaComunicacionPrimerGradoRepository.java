package com.edukt.grados.primero.comunicacion;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "COM1G")
public interface TemaComunicacionPrimerGradoRepository
    extends MongoRepository<TemaComunicacionPrimerGrado, String> {
}
