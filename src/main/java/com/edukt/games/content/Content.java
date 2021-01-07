package com.edukt.games.content;

import lombok.Data;

import java.util.List;

@Data
public class Content {
  private String description;
  private List<String> words;

  public Content() {
  }

  public Content(String description, List<String> words) {
    this.description = description;
    this.words = words;
  }
}
