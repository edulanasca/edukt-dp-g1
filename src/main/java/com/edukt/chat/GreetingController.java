package com.edukt.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;


@Controller
public class GreetingController {

  @MessageMapping("/send")
  @SendTo("/topic/messages")
  public Message greeting(Message message) {
    return new Message(message.getFrom(), message.getMessage(), LocalDateTime.now());
  }


  @MessageMapping("/to")
  @SendTo("/topic/other")
  public Message greeting_2(Message message) {
    return new Message(message.getFrom(), message.getMessage() + " in other ", LocalDateTime.now());
  }

}
