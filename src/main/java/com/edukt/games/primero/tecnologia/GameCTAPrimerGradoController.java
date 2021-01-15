package com.edukt.games.primero.tecnologia;

import com.edukt.games.decorator.GameDecorator;
import com.edukt.games.decorator.HideWordsDecorator;
import com.edukt.games.decorator.ShuffleWordsDecorator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/games/CTA1G")
public class GameCTAPrimerGradoController {

  private GameCTAPrimerGradoRepository primerGradoRepository;

  @Autowired
  public void setPrimerGradoRepository(GameCTAPrimerGradoRepository primerGradoRepository) {
    this.primerGradoRepository = primerGradoRepository;
  }

  @GetMapping("/{game_id}")
  public GameCTAPrimerGrado getGame(
      @RequestParam(value = "level", required = false, defaultValue = "") String level,
      @PathVariable String game_id) {
    GameCTAPrimerGrado game = this.primerGradoRepository
        .findById(game_id).orElseGet(GameCTAPrimerGrado::new);

    GameDecorator decorator;

    switch (level) {
      case "hide":
        decorator = new HideWordsDecorator(game);
        game.setContents(decorator.obtenerContenido());
        break;
      case "shuffle":
        decorator = new ShuffleWordsDecorator(game);
        game.setContents(decorator.obtenerContenido());
        break;
      case "both":
        decorator = new HideWordsDecorator(new ShuffleWordsDecorator(game));
        game.setContents(decorator.obtenerContenido());
        break;
    }

    return game;
  }
}
