package com.edukt.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Set;

@CrossOrigin
@Controller
public class WebSocketChatController implements ActiveUserChangeObserver {

  private SimpMessagingTemplate webSocket;
  private ActiveUserManager activeUserManager;

  @Autowired
  public void setWebSocket(SimpMessagingTemplate webSocket) {
    this.webSocket = webSocket;
  }

  @Autowired
  public void setActiveUserManager(ActiveUserManager activeUserManager) {
    this.activeUserManager = activeUserManager;
  }

  @PostConstruct
  private void init() {
    activeUserManager.registerConnection(this);
  }

  @PreDestroy
  private void destroy() {
    activeUserManager.removeConnection(this);
  }

  @MessageMapping("/chat")
  public void send(@Payload ChatMessage chatMessage, @Header(name = "sender") String sender) {

    ChatMessage message =
        new ChatMessage(chatMessage.getFrom(), chatMessage.getText(), chatMessage.getRecipient());

    if (!sender.equals(chatMessage.getRecipient())) {
      webSocket.convertAndSend("/user/" + chatMessage.getRecipient() + "/message", message);
    }

    webSocket.convertAndSend("/user/" + sender + "/message", message);
  }

  @Override
  public void notifyActiveUserChange() {
    Set<String> activeUsers = activeUserManager.getAll();
    webSocket.convertAndSend("/topic/active", activeUsers);
  }
}
