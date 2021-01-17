package com.edukt.quiz;

import lombok.Data;

import java.util.List;

@Data
public abstract class AbstractQuiz {
  private String id;
  private List<Pregunta> preguntas;

  public AbstractQuiz() {
  }

  public AbstractQuiz(List<Pregunta> preguntas) {
    this.preguntas = preguntas;
  }
}
