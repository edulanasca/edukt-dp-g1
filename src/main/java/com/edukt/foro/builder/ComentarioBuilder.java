package com.edukt.foro.builder;

import com.edukt.foro.model.Comentario;

import java.time.LocalDateTime;

import static java.util.UUID.randomUUID;

public class ComentarioBuilder implements ForoBuilder {

  private String uuid;
  private String autor;
  private LocalDateTime fechaPub;
  private String texto;

  @Override
  public ComentarioBuilder conId(String uuid) {
    this.uuid = uuid;
    return this;
  }

  @Override
  public ComentarioBuilder conAutor(String autor) {
    this.autor = autor;
    return this;
  }

  @Override
  public ComentarioBuilder conFechaHora(LocalDateTime fechaHora) {
    this.fechaPub = fechaHora;
    return null;
  }

  @Override
  public ComentarioBuilder conTexto(String texto) {
    this.texto = texto;
    return this;
  }

  @Override
  public Comentario build() {
    Comentario c = new Comentario();
    c.setUuid(this.uuid == null ? randomUUID().toString() : this.uuid);
    c.setAutor(this.autor);
    c.setFechaPub(this.fechaPub == null ? LocalDateTime.now() : this.fechaPub);
    c.setTexto(this.texto);
    return c;
  }
}
