package com.edukt.quiz;

import java.util.List;

public class Pregunta {
  private String enunciado;
  private List<Alternativa> alternativas;

  public Pregunta() {
  }

  public Pregunta(String enunciado, List<Alternativa> alternativas) {
    this.enunciado = enunciado;
    this.alternativas = alternativas;
  }

  public String getEnunciado() {
    return enunciado;
  }

  public void setEnunciado(String enunciado) {
    this.enunciado = enunciado;
  }

  public List<Alternativa> getAlternativas() {
    return alternativas;
  }

  public void setAlternativas(List<Alternativa> alternativas) {
    this.alternativas = alternativas;
  }
}
