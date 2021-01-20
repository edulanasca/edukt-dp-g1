package com.edukt.games.primero.tecnologia;

import com.edukt.games.decorator.GameDecorator;
import com.edukt.games.decorator.HideWordsDecorator;
import com.edukt.games.decorator.ShuffleWordsDecorator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/gamesCTA1G")
public class GameCTAPrimerGradoController {

  private GameCTAPrimerGradoRepository primerGradoRepository;

  @Autowired
  public void setPrimerGradoRepository(GameCTAPrimerGradoRepository primerGradoRepository) {
    this.primerGradoRepository = primerGradoRepository;
  }

  @GetMapping
  public GameCTAPrimerGrado getGame(
      @RequestParam(value = "temaId", required = false) String tema_id,
      @RequestParam(value = "level", required = false, defaultValue = "") String level) {
    GameCTAPrimerGrado game = this.primerGradoRepository
        .findGameCTAPrimerGradoByTemaId(tema_id);

    GameDecorator decorator;

    switch (level) {
      case "hide":
        decorator = new HideWordsDecorator(game);
        game.setContents(decorator.getContents());
        break;
      case "shuffle":
        decorator = new ShuffleWordsDecorator(game);
        game.setContents(decorator.getContents());
        break;
      case "both":
        decorator = new ShuffleWordsDecorator(new HideWordsDecorator(game));
        game.setContents(decorator.getContents());
        break;
    }

    return game;
  }

  @PostMapping("/validar")
  public List<Boolean> validarGame(
      @RequestParam(value = "temaId", required = false) String tema_id,
      @RequestBody List<String> words) {

    List<Boolean> correccion = new ArrayList<>();

    GameCTAPrimerGrado game = this.primerGradoRepository
        .findGameCTAPrimerGradoByTemaId(tema_id);

    Iterator<String> wordsFromBd =
        game
            .getContents()
            .stream()
            .flatMap(content -> content.getWords().stream())
            .iterator();

    Iterator<String> wordsFromUser = words.iterator();

    while (wordsFromBd.hasNext() && wordsFromUser.hasNext()) {
      correccion.add(wordsFromBd.next().equals(wordsFromUser.next()));
    }

    return correccion;
  }
}
