package com.edukt.quiz.base;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "quizzes")
public interface BaseQuizRepository extends MongoRepository<Quiz, String> {
}
