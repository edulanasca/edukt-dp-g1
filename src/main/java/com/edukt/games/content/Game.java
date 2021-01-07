package com.edukt.games.content;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public abstract class Game {

  @Id
  private String id;

  private String temaId;
  private List<Content> contents;

  public Game() {
  }

  public Game(String id, String temaId, List<Content> contents) {
    this.id = id;
    this.temaId = temaId;
    this.contents = contents;
  }

  public Game(String temaId, List<Content> contents) {
    this(null, temaId, contents);
  }

  public Game(List<Content> contents) {
    this(null, contents);
  }

  public abstract List<Content> obtenerContenido();

}
