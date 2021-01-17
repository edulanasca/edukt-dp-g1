package com.edukt.quiz.state;

import com.edukt.quiz.user.UserQuiz;
import com.edukt.quiz.base.Quiz;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("aprobado")
public class QuizAprobado extends QuizState {

  public QuizAprobado(UserQuiz userQuiz) {
    super(userQuiz);
    super.setProfesorAsignado("Niguno");
  }

  public QuizAprobado(Quiz dbQuiz, UserQuiz userQuiz) {
    super(dbQuiz, userQuiz);
  }

  @Override
  public void checkQuiz() {
    System.out.println("El estudiante " + userQuiz.getUsername()  +" está aprobado");
  }
}
