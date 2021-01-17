package com.edukt.api.data;

import java.util.List;
import java.util.Random;

public class Teachers {

  public static final List<String> teachers = List.of("Glyn Fergie", "Rudolf Jacob", "Florentin " +
          "Turgay",
      "Rin Andrea", "Risto Slavitsa");

  public static String getTeacher() {
    return teachers.get(new Random().nextInt(teachers.size()));
  }
}
