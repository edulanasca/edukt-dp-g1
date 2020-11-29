package com.edukt.grados.primero.ciencia.sociales;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "CS1G")
public interface TemaCienciasSocialesPrimerGradoRepository extends
    MongoRepository<TemaCienciasSocialesPrimerGrado, String> {

}
