package com.edukt.games.decorator;

import com.edukt.games.content.Game;

public abstract class GameDecorator extends Game {

  public GameDecorator (Game game) {
    super(game.getId(), game.getTemaId(), game.getContents());
  }

  protected abstract void formatear();
}
