package com.edukt.chat;

/**
 * Representa a los usuarios activos en la conexión
 */
public interface ActiveUserObservable {
  void registerConnection(ActiveUserChangeObserver observer);
  void removeConnection(ActiveUserChangeObserver observer);
  void notifyAllActiveConnections();
}
