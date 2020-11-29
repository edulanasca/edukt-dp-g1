package com.edukt.foro.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "tipo")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Publicacion.class, name = "pub"),
    @JsonSubTypes.Type(value = Comentario.class, name = "com")
})
@ApiModel(value = "Foro", description = "Json base de Comentario y Publicación.")
public abstract class Foro {

  @ApiModelProperty(value = "Autor de la publicación.", required = true)
  protected String autor;

  @ApiModelProperty(value = "Fecha de la publicación. Por defecto, guarda la fecha actual.")
  protected LocalDateTime fechaPub;

  @ApiModelProperty(value = "El texto de la publicación.", required = true)
  protected String texto;

  public Foro() {
    fechaPub = LocalDateTime.now();
  }

  abstract Foro buscar(String id);
}
