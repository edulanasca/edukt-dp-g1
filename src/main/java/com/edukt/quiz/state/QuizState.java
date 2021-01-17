package com.edukt.quiz.state;

import com.edukt.quiz.user.UserQuiz;
import com.edukt.quiz.base.Quiz;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "estado")
@JsonSubTypes({
    @JsonSubTypes.Type(value = QuizCreado.class, name = "creado"),
    @JsonSubTypes.Type(value = QuizAprobado.class, name = "aprobado"),
    @JsonSubTypes.Type(value = QuizDesaprobado.class, name = "desaprobado")
})
public abstract class QuizState {

  @JsonIgnore
  protected Quiz dbQuiz;
  @JsonIgnore
  protected UserQuiz userQuiz;

  private String profesorAsignado;

  public QuizState() {
  }

  public QuizState(UserQuiz userQuiz) {
    this.userQuiz = userQuiz;
  }

  public QuizState(Quiz dbQuiz, UserQuiz userQuiz) {
    this.dbQuiz = dbQuiz;
    this.userQuiz = userQuiz;
  }

  public Quiz getDbQuiz() {
    return dbQuiz;
  }

  public void setDbQuiz(Quiz dbQuiz) {
    this.dbQuiz = dbQuiz;
  }

  public UserQuiz getUserQuiz() {
    return userQuiz;
  }

  public void setUserQuiz(UserQuiz userQuiz) {
    this.userQuiz = userQuiz;
  }

  public String getProfesorAsignado() {
    return profesorAsignado;
  }

  public void setProfesorAsignado(String profesorAsignado) {
    this.profesorAsignado = profesorAsignado;
  }

  public abstract void checkQuiz();
}
