package com.edukt.grados.cursos.temas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tema {
  private String titulo;
  private String descripcion;
  private List<Seccion> secciones;
}
