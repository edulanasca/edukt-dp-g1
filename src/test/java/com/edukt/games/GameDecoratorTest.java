package com.edukt.games;

import com.edukt.games.content.Content;
import com.edukt.games.decorator.HideWordsDecorator;
import com.edukt.games.decorator.ShuffleWordsDecorator;
import com.edukt.games.primero.GamePrimerGradoFactory;
import com.edukt.games.primero.tecnologia.GameCTAPrimerGrado;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameDecoratorTest {

  public static GameCTAPrimerGrado ctaPrimerGrado;
  public static Content content;
  public static Content content1;

  @BeforeAll
  public static void init() {
    System.out.println("Executed");
    content = new Content("Usamos la nariz para [] y la boca para []",
        List.of("olertextoprueba", "comer"));
    content1 = new Content("Tenemos [] sentidos, con los [] yo puedo ver",
        List.of("cincosentidoscuantoshayhaifai", "ojos"));

    ctaPrimerGrado = (GameCTAPrimerGrado) new GamePrimerGradoFactory().getCienciaTecnologia();
    ctaPrimerGrado.setContents(List.of(content, content1));
  }


  @Test
  void gameWithoutDecorator() {
    assertEquals(ctaPrimerGrado.obtenerContenido().get(0), content);
    assertEquals(ctaPrimerGrado.obtenerContenido().get(1), content1);
  }

  @Test
  void gameWithShuffleWordsDecorator() {
    ShuffleWordsDecorator shuffleWordsDecorator = new ShuffleWordsDecorator(ctaPrimerGrado);

    Iterator<String> it1 =
        ctaPrimerGrado
            .obtenerContenido()
            .stream()
            .flatMap(content -> content.getWords().stream())
            .collect(Collectors.toList())
            .iterator();

    Iterator<String> it2 = shuffleWordsDecorator
        .obtenerContenido()
        .stream()
        .flatMap(content -> content.getWords().stream())
        .collect(Collectors.toList())
        .iterator();

    while (it1.hasNext() && it2.hasNext()) {
      String w1 = it1.next();
      String w2 = it2.next();

      System.out.printf("Regular word -> %s\nDecorated Word -> %s\n", w1, w2);

      assertEquals(w1.length(), w2.length());
    }
  }

  @Test
  void gameWithHideWordsDecorator() {
    HideWordsDecorator hideWordsDecorator = new HideWordsDecorator(ctaPrimerGrado);
    hideWordsDecorator
        .obtenerContenido()
        .stream()
        .flatMap(content -> content.getWords().stream())
        .forEach(word -> assertTrue(word.contains("*")));
  }

}
