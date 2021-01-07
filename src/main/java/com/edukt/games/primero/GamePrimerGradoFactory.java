package com.edukt.games.primero;

import com.edukt.games.GameFactory;
import com.edukt.games.content.*;
import com.edukt.games.primero.tecnologia.GameCTAPrimerGrado;

public class GamePrimerGradoFactory implements GameFactory {
  @Override
  public GameCTA getCienciaTecnologia() {
    return new GameCTAPrimerGrado();
  }

  @Override
  public GameCienciasSociales getCienciasSociales() {
    return null;
  }

  @Override
  public GameComunicacion getComunicacion() {
    return null;
  }

  @Override
  public GameIngles getIngles() {
    return null;
  }

  @Override
  public GameMatematica getMatematica() {
    return null;
  }
}
