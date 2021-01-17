package com.edukt.quiz.state;

import com.edukt.quiz.user.UserQuiz;
import com.edukt.quiz.base.Quiz;
import com.fasterxml.jackson.annotation.JsonTypeName;

import static com.edukt.api.data.Teachers.getTeacher;

@JsonTypeName("desaprobado")
public class QuizDesaprobado extends QuizState{

  public QuizDesaprobado() {
  }

  public QuizDesaprobado(UserQuiz userQuiz) {
    super(userQuiz);
    super.setProfesorAsignado(getTeacher());
  }

  public QuizDesaprobado(Quiz dbQuiz, UserQuiz userQuiz) {
    super(dbQuiz, userQuiz);
  }

  @Override
  public void checkQuiz() {
    System.out.println("El estudiante " + userQuiz.getUsername() + " está desaprobado. Se le ha " +
        "asignado el tutor " + super.getProfesorAsignado());
  }
}
