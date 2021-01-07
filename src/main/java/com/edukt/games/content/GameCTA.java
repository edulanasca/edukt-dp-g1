package com.edukt.games.content;

import java.util.List;

public abstract class GameCTA extends Game {

  public GameCTA() {
  }

  public GameCTA(String temaId, List<Content> contents) {
    super(temaId, contents);
  }

  public GameCTA(List<Content> contents) {
    super(contents);
  }

}
