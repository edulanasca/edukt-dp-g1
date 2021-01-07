package com.edukt.games;

import com.edukt.games.content.Content;
import com.edukt.games.content.decorator.HideWordsDecorator;
import com.edukt.games.content.decorator.ShuffleWordsDecorator;
import com.edukt.games.primero.GamePrimerGradoFactory;
import com.edukt.games.primero.tecnologia.GameCTAPrimerGrado;

import java.util.List;

public class TestingGames {
  public static void main(String[] args) {
    GameFactory gameFactory = new GamePrimerGradoFactory();
    GameCTAPrimerGrado ctaPrimerGrado = (GameCTAPrimerGrado) gameFactory.getCienciaTecnologia();

    ctaPrimerGrado.setContents(List.of(
        new Content("Usamos la nariz para [] y la boca para []",
            List.of("olertextoprueba", "comer")),
        new Content("Tenemos [] sentidos, con los [] yo puedo ver",
            List.of("cincosentidoscuantoshayhaifai", "ojos"))
    ));

    // easy
    System.out.println("\nEASY");
    ctaPrimerGrado.obtenerContenido().forEach(System.out::println);

    // medium
    System.out.println("\nMEDIUM");
    ShuffleWordsDecorator completeDecorator = new ShuffleWordsDecorator(ctaPrimerGrado);
    completeDecorator.obtenerContenido().forEach(System.out::println);

    // hard
    System.out.println("\nHARD");
    HideWordsDecorator hideWordsDecorator = new HideWordsDecorator(completeDecorator);
    hideWordsDecorator.obtenerContenido().forEach(System.out::println);

  }
}
