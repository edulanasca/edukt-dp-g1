package com.edukt.chat;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.*;

@Component
public class ActiveUserManager implements ActiveUserObservable {

  private final Map<String, Object> map;

  private final List<ActiveUserChangeObserver> observer;

  private final ThreadPoolExecutor notifyPool;

  private ActiveUserManager() {
    map = new HashMap<>();
    observer = new CopyOnWriteArrayList<>();
    notifyPool = new ThreadPoolExecutor(1, 5, 10,
        TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));
  }

  public void add(String userName, String remoteAddress) {
    map.put(userName, remoteAddress);
  }

  public void remove(String username) {
    map.remove(username);
  }

  /**
   * Obtiene a todos los usuarios conectados
   *
   * @return - Conjunto de usuarios conectados.
   */
  public Set<String> getAll() {
    return map.keySet();
  }

  /**
   * Obtiene a todos los usuarios excepto al usuario que lo ha solicitado
   *
   * @param username - username actual
   * @return - Conjunto de usuarios exceptuando al username pasado
   */
  public Set<String> getActiveUsersExceptCurrentUser(String username) {
    Set<String> users = new LinkedHashSet<>(map.keySet());
    users.remove(username);
    return users;
  }

  /**
   * Ser notificado cuando un usuario entra o sale del chat
   *
   * @param listener - objeto que implementa ActiveUserChangeObserver
   */
  @Override
  public void registerConnection(ActiveUserChangeObserver listener) {
    observer.add(listener);
  }

  /**
   * Dejar de ser notificado cuando un usuario entra o sale del chat
   *
   * @param listener - objeto que implementa ActiveUserChangeObserver
   */
  @Override
  public void removeConnection(ActiveUserChangeObserver listener) {
    observer.remove(listener);
  }

  @Override
  public void notifyAllActiveConnections() {
    notifyPool.submit(() -> observer.forEach(ActiveUserChangeObserver::notifyActiveUserChange));
  }
}
