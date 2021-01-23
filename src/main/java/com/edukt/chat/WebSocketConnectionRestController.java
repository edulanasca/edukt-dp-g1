package com.edukt.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Set;

@CrossOrigin
@RestController
public class WebSocketConnectionRestController {

  private ActiveUserManager activeSessionManager;

  @Autowired
  public void setActiveSessionManager(ActiveUserManager activeSessionManager) {
    this.activeSessionManager = activeSessionManager;
  }

  @PostMapping("/rest/user-connect")
  public String userConnect(@RequestBody Map<String, Object> body) {
    String username = (String) body.get("username");

    activeSessionManager.add(username, username);
    activeSessionManager.notifyAllActiveConnections();
    return username;
  }

  @PostMapping("/rest/user-disconnect")
  public String userDisconnect(@RequestBody Map<String, Object> body) {
    activeSessionManager.remove((String) body.get("username"));
    activeSessionManager.notifyAllActiveConnections();
    return "disconnected";
  }

  @GetMapping("/rest/active-users-except/{userName}")
  public Set<String> getActiveUsersExceptCurrentUser(@PathVariable String userName) {
    return activeSessionManager.getActiveUsersExceptCurrentUser(userName);
  }
}
