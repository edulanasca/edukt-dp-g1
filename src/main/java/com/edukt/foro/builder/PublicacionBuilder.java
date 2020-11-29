package com.edukt.foro.builder;

import com.edukt.foro.model.Foro;
import com.edukt.foro.model.Publicacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PublicacionBuilder implements ForoBuilder {

  private String id;
  private String autor;
  private LocalDateTime fechaPub;
  private int grado;
  private String curso;
  private String titulo;
  private String texto;
  private List<Foro> comentarios;

  public PublicacionBuilder() {
    comentarios = new ArrayList<>();
  }

  @Override
  public PublicacionBuilder conId(String id) {
    this.id = id;
    return this;
  }

  @Override
  public PublicacionBuilder conAutor(String autor) {
    this.autor = autor;
    return this;
  }

  @Override
  public PublicacionBuilder conFechaHora(LocalDateTime fechaHora) {
    this.fechaPub = fechaHora;
    return this;
  }

  public PublicacionBuilder conGrado(int grado) {
    this.grado = grado;
    return this;
  }

  public PublicacionBuilder conCurso(String curso) {
    this.curso = curso;
    return this;
  }

  public PublicacionBuilder conTitulo(String titulo) {
    this.titulo = titulo;
    return this;
  }

  @Override
  public PublicacionBuilder conTexto(String texto) {
    this.texto = texto;
    return this;
  }

  public PublicacionBuilder conComentarios(List<Foro> comentarios) {
    this.comentarios = comentarios;
    return this;
  }

  @Override
  public Publicacion build() {
    Publicacion p = new Publicacion();
    p.setId(this.id);
    p.setAutor(this.autor);
    p.setFechaPub(this.fechaPub == null ? LocalDateTime.now() : this.fechaPub);
    p.setGrado(this.grado);
    p.setCurso(this.curso);
    p.setTitulo(this.titulo);
    p.setTexto(this.texto);
    p.setComentarios(this.comentarios);
    return p;
  }

}
