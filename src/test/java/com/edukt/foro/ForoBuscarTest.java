package com.edukt.foro;


import com.edukt.foro.builder.ComentarioBuilder;
import com.edukt.foro.builder.PublicacionBuilder;
import com.edukt.foro.model.Publicacion;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ForoBuscarTest {

  private static Publicacion raiz;

  @BeforeAll
  public static void init() {

    /*
         R
      /  |    \
     A   B     P
           /  / |  \
         PA  PB  C  D
                / \
               CA CB
     */

    raiz = new PublicacionBuilder().conId("R").build();
    raiz.getComentarios().add(new ComentarioBuilder().conId("A").build());
    raiz.getComentarios().add(new ComentarioBuilder().conId("B").build());
    Publicacion p1 = new PublicacionBuilder().conId("P").build();
    p1.getComentarios().add(new ComentarioBuilder().conId("PA").build());
    p1.getComentarios().add(new ComentarioBuilder().conId("PB").build());
    Publicacion p2 = new PublicacionBuilder().conId("C").build();
    Publicacion d = new PublicacionBuilder().conId("D").build();
    p1.getComentarios().add(d);
    p2.getComentarios().add(new ComentarioBuilder().conId("CA").build());
    p2.getComentarios().add(new ComentarioBuilder().conId("CB").build());
    p1.getComentarios().add(p2);
    raiz.getComentarios().add(p1);
  }

  @Test
  void buscarComentario() {
    assertNull(raiz.buscar("CA"));
  }

  @Test
  void buscarPublicacionConListaComentariosVacia() {
    assertEquals(raiz.buscar("D").getId(), "D");
  }

  @Test
  void buscarPublicacionConListaComentariosNoVacia() {
    assertEquals(raiz.buscar("P").getId(), "P");
  }

  @Test
  void buscarPublicacionRaiz() {
    assertEquals(raiz.buscar("R").getId(), "R");
  }
}
