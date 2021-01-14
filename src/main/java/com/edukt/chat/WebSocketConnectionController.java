package com.edukt.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Set;

@RestController
public class WebSocketConnectionController {

  private ActiveUserManager activeSessionManager;

  @Autowired
  public void setActiveSessionManager(ActiveUserManager activeSessionManager) {
    this.activeSessionManager = activeSessionManager;
  }

  @PostMapping("/rest/user-connect")
  public String userConnect(HttpServletRequest request, Map<String, Object> body) {
    String remoteAddr = "";
    if (request != null) {
      remoteAddr = request.getHeader("Remote_Addr");
      if (remoteAddr.isEmpty()) {
        remoteAddr = request.getHeader("X-FORWARDED-FOR");
        if (remoteAddr == null || "".equals(remoteAddr)) {
          remoteAddr = request.getRemoteAddr();
        }
      }
    }

    activeSessionManager.add((String) body.get("username"), remoteAddr);
    activeSessionManager.notifyAllActiveConnections();
    return remoteAddr;
  }

  @PostMapping("/rest/user-disconnect")
  public String userDisconnect(Map<String, Object> body) {
    activeSessionManager.remove((String) body.get("username"));
    activeSessionManager.notifyAllActiveConnections();
    return "disconnected";
  }

  @GetMapping("/rest/active-users-except/{userName}")
  public Set<String> getActiveUsersExceptCurrentUser(@PathVariable String userName) {
    return activeSessionManager.getActiveUsersExceptCurrentUser(userName);
  }
}
