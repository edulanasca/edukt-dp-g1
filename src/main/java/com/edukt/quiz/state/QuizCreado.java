package com.edukt.quiz.state;

import com.edukt.quiz.Alternativa;
import com.edukt.quiz.user.UserQuiz;
import com.edukt.quiz.base.Quiz;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Iterator;

@JsonTypeName("creado")
public class QuizCreado extends QuizState {

  public QuizCreado() {
    super();
  }

  public QuizCreado(Quiz dbQuiz, UserQuiz userQuiz) {
    super(dbQuiz, userQuiz);
  }

  @Override
  public void checkQuiz() {
    Iterator<Alternativa> altsFromDb =
        super.dbQuiz.getPreguntas()
            .stream()
            .flatMap(pregunta -> pregunta.getAlternativas().stream())
            .iterator();

    Iterator<Alternativa> altsFromUser =
        super.userQuiz.getPreguntas()
            .stream()
            .flatMap(pregunta -> pregunta.getAlternativas().stream())
            .iterator();

    int puntaje = 0;

    while (altsFromDb.hasNext() && altsFromUser.hasNext()) {
      Alternativa fromUser = altsFromUser.next();
      Alternativa fromDb = altsFromDb.next();

      if (fromUser.isCorrecta() && fromDb.isCorrecta()) {
        puntaje ++;
      }
    }

    super.userQuiz.setPuntaje(puntaje);
    super.userQuiz.setState(puntaje >= 11 ? new QuizAprobado(userQuiz) :
        new QuizDesaprobado(userQuiz));
  }
}
