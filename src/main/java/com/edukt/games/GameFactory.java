package com.edukt.games;

import com.edukt.games.content.*;

public interface GameFactory {
  GameCienciasSociales getCienciasSociales();
  GameCTA getCienciaTecnologia();
  GameComunicacion getComunicacion();
  GameIngles getIngles();
  GameMatematica getMatematica();
}
