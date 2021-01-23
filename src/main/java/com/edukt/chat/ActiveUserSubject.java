package com.edukt.chat;

/**
 * Representa a los usuarios activos en la conexión
 */
public interface ActiveUserSubject {
  void registerObserver(ActiveUserChangeObserver listener);
  void removeObserver(ActiveUserChangeObserver listener);
  void notifyObservers();
}
