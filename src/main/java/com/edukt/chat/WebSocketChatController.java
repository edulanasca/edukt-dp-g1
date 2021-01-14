package com.edukt.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.security.Principal;
import java.util.Set;

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
    System.out.println("Active user registrado"); // TODO delete
  }

  @PreDestroy
  private void destroy() {
    activeUserManager.removeConnection(this);
  }

  @MessageMapping("/chat")
  public void send(SimpMessageHeaderAccessor sha, @Payload ChatMessage chatMessage) throws Exception {
    Principal user = sha.getUser();
    Assert.notNull(user, "User must not be null");
    String sender = user.getName();
    ChatMessage message = new ChatMessage(chatMessage.getFrom(), chatMessage.getText(), chatMessage.getRecipient());
    if (!sender.equals(chatMessage.getRecipient())) {
      webSocket.convertAndSendToUser(sender, "/queue/messages", message);
    }

    webSocket.convertAndSendToUser(chatMessage.getRecipient(), "/queue/messages", message);
  }

  @Override
  public void notifyActiveUserChange() {
    Set<String> activeUsers = activeUserManager.getAll();
    webSocket.convertAndSend("/topic/active", activeUsers);
  }
}
