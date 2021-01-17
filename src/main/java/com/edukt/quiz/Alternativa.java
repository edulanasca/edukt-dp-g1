package com.edukt.quiz;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Alternativa {
  private String descripcion;

  @JsonProperty
  private boolean correcta;

  public Alternativa() {
  }

  public Alternativa(String descripcion, boolean correcta) {
    this.descripcion = descripcion;
    this.correcta = correcta;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  @JsonIgnore
  public boolean isCorrecta() {
    return correcta;
  }

  public void setCorrecta(boolean correcta) {
    this.correcta = correcta;
  }
}
