package com.edukt.foro.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import static java.util.UUID.randomUUID;

@Data
@EqualsAndHashCode(callSuper = false)
@JsonTypeName("com")
@ApiModel(description = "Comentario de una publicación")
public class Comentario extends Foro {

  @ApiModelProperty(value = "El UUID del comentario", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
  private String uuid;

  public Comentario() {
    super();
    uuid = randomUUID().toString();
  }

  /**
   * @throws UnsupportedOperationException Operacion no soportada en comentario
   */
  @Override
  public Foro buscar(String id) throws UnsupportedOperationException {
    throw new UnsupportedOperationException("Operacion no soportada en Comentario");
  }
}
