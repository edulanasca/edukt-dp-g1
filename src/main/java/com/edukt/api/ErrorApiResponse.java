package com.edukt.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ErrorApiResponse extends ApiResponse {

  private String message;

  public ErrorApiResponse(String message) {
    super(Tipo.ERROR, null);
    this.message = message;
  }
}
