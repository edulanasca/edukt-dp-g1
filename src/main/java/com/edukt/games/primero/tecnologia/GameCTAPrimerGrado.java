package com.edukt.games.primero.tecnologia;

import com.edukt.games.content.Content;
import com.edukt.games.content.GameCTA;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("CTA4G_Games")
public class GameCTAPrimerGrado extends GameCTA {

  public GameCTAPrimerGrado() {
    super();
  }

  @Override
  public List<Content> obtenerContenido() {
    return super.getContents();
  }
}
