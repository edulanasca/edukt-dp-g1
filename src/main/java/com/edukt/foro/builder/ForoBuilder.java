package com.edukt.foro.builder;

import com.edukt.foro.model.Foro;

import java.time.LocalDateTime;

public interface ForoBuilder {

  ForoBuilder conId(String id);
  ForoBuilder conAutor(String autor);
  ForoBuilder conFechaHora(LocalDateTime fechaHora);
  ForoBuilder conTexto(String texto);
  Foro build();
}
