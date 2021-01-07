package com.edukt.games.content.decorator;

import com.edukt.games.content.Content;
import com.edukt.games.content.Game;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class HideWordsDecorator extends GameDecorator {

  public HideWordsDecorator(Game game) {
    super(game);
  }

  @Override
  public List<Content> obtenerContenido() {

    for (Content content : super.getContents()) {
      content.setWords(
          content
              .getWords()
              .stream()
              .map(this::hide)
              .collect(Collectors.toList())
      );
    }

    return super.getContents();
  }

  private String hide(String word) {
    char[] chars = word.toCharArray();
    Random rnd = new Random();

    for (int i = chars.length/2; i > 0; i--) {
      int index = rnd.nextInt(i + 1);
      chars[index] = '*';
    }

    return String.valueOf(chars);
  }
}
