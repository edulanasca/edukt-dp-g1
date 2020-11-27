package com.edukt.foro.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Comentario extends Foro {

  private String uuid;

  public Comentario() {
    super();
  }
}
