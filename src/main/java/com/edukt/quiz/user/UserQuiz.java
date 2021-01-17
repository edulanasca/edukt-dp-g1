package com.edukt.quiz.user;

import com.edukt.quiz.AbstractQuiz;
import com.edukt.quiz.Pregunta;
import com.edukt.quiz.base.Quiz;
import com.edukt.quiz.state.QuizCreado;
import com.edukt.quiz.state.QuizState;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UserQuiz extends AbstractQuiz {
  private String username;
  private Integer puntaje;
  private String quiz_id;
  private QuizState state;

  public UserQuiz() {
  }

  public UserQuiz(List<Pregunta> preguntas, String username, String quiz_id) {
    super(preguntas);
    this.username = username;
    this.quiz_id = quiz_id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @JsonProperty(access = JsonProperty.Access.READ_ONLY)
  public Integer getPuntaje() {
    return puntaje;
  }

  public void setPuntaje(Integer puntaje) {
    this.puntaje = puntaje;
  }

  public String getQuiz_id() {
    return quiz_id;
  }

  public void setQuiz_id(String quiz_id) {
    this.quiz_id = quiz_id;
  }

  public QuizState getState() {
    return state;
  }

  public void setState(QuizState state) {
    this.state = state;
  }

  public void revisar(Quiz qFromDb) {
    this.setQuiz_id(quiz_id);
    this.setState(new QuizCreado(qFromDb, this));
    this.state.checkQuiz();
  }

  @Override
  public String toString() {
    return "UserQuiz{" +
        "username='" + username + '\'' +
        ", puntaje=" + puntaje +
        ", quiz_id='" + quiz_id + '\'' +
        ", state=" + state +
        '}';
  }
}
