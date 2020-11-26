package com.edukt.grados.cursos.temas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seccion {
  private List<String> img_urls;
  private String contenido;
}
