package com.edukt.chat;

/**
 * Interfaz que observa cuando un usuario se conecta o retira del chat
 */
public interface ActiveUserChangeObserver {

  /**
   * Es llamado para notificar el estado de un usuario en el chat
   */
  void notifyActiveUserChange();
}