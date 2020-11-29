package com.edukt.grados.tema;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Tema", description = "Json base para los diferentes temas")
public abstract class Tema {

  @Id
  @ApiModelProperty(value = "Id del tema.", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
  private String id;

  @ApiModelProperty(value = "Nombre del curso.", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
  private String nombreCurso;

  @ApiModelProperty(value = "Grado del curso", accessMode = ApiModelProperty.AccessMode.READ_ONLY)
  private int grado;

  @ApiModelProperty(value = "Titulo del tema", required = true, position = 1)
  private String titulo;

  @ApiModelProperty(value = "Descripción del tema.", required = true, position = 2)
  private String descripcion;

  @ApiModelProperty(value = "Lista de temas del curso.", required = true, position = 3)
  private List<Seccion> secciones;

  public Tema(String nombreCurso, int grado, String titulo, String descripcion, List<Seccion> secciones) {
    this(null, nombreCurso, grado, titulo, descripcion, secciones);
  }

  public Tema(String nombreCurso, int grado) {
    this.nombreCurso = nombreCurso;
    this.grado = grado;
  }
}
