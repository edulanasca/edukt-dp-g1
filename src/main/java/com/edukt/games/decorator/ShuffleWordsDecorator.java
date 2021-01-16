package com.edukt.games.decorator;

import com.edukt.games.content.Content;
import com.edukt.games.content.Game;

import java.util.Random;
import java.util.stream.Collectors;

public class ShuffleWordsDecorator extends GameDecorator {

  public ShuffleWordsDecorator(Game game) {
    super(game);
    formatear();
  }

  @Override
  protected void formatear() {
    for (Content content : super.getContents()) {
      content.setWords(
          content
              .getWords()
              .stream()
              .map(this::shuffle)
              .collect(Collectors.toList())
      );
    }
  }

  private String shuffle(String word) {
    char[] chars = word.toCharArray();
    Random rnd = new Random();

    for (int i = chars.length - 1; i > 0; i--) {
      int index = rnd.nextInt(i + 1);

      char a = chars[index];
      chars[index] = chars[i];
      chars[i] = a;
    }

    return String.valueOf(chars);
  }
}
