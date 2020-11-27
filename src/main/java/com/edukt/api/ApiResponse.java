package com.edukt.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {

  private Tipo tipo;
  private Object data;

  public enum Tipo {
    SUCCESS,
    FAILURE,
    ERROR
  }


}
