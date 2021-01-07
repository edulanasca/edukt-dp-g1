package com.edukt.chat;

import java.time.LocalDateTime;

public class Message {
  private String from;
  private String message;
  private LocalDateTime timestamp;

  public Message() {
    // required for Jackson
  }

  public Message(String from, String message, LocalDateTime timestamp) {
    this.from = from;
    this.message = message;
    this.timestamp = timestamp;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }
}
