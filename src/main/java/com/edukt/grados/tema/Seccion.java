package com.edukt.grados.tema;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Seccion", description = "Sección del tema.")
public class Seccion {

  @ApiModelProperty(value = "Urls de imagenes a mostrar en la sección. Mínimo dos", required = true)
  private List<String> img_urls;

  @ApiModelProperty(value = "La información de la sección a mostrar", required = true)
  private String contenido;
}
