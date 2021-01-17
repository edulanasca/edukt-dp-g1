package com.edukt.quiz.base;

import com.edukt.quiz.AbstractQuiz;
import com.edukt.quiz.Pregunta;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Quiz extends AbstractQuiz {
  private String tema_id;

  public Quiz() {
    super();
  }

  public Quiz(String tema_id) {
    this.tema_id = tema_id;
  }

  public Quiz(List<Pregunta> preguntas, String tema_id) {
    super(preguntas);
    this.tema_id = tema_id;
  }
}
