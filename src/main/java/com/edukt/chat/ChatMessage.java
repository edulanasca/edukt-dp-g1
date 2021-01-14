package com.edukt.chat;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class ChatMessage {
  private static final String TIME_FORMATTER= "HH:mm:ss";

  private String from;
  private String text;
  private String recipient;
  private String time;

  public ChatMessage() {
  }

  public ChatMessage(String from, String text, String recipient) {
    this.from = from;
    this.text = text;
    this.recipient = recipient;
    this.time = LocalDateTime.now().format(DateTimeFormatter.ofPattern(TIME_FORMATTER));
  }

}
