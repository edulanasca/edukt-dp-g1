package com.edukt.foro.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public abstract class Foro {

  protected String autor;
  protected LocalDateTime fechaPub;
  protected String texto;

}
