package com.edukt.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

  /*
  The registerStompEndpoints() method registers the /gs-guide-websocket endpoint,
  enabling SockJS fallback options so that alternate transports can be used if WebSocket is not available.
  The SockJS client will attempt to connect to /gs-guide-websocket and use the best available transport
  (websocket, xhr-streaming, xhr-polling, and so on).

   */
  @Override
  public void registerStompEndpoints(StompEndpointRegistry registry) {
    /*
    The endpoint /websocket will allow us to connect to ws://localhost:8080/websocket with the default Spring port configuration
     */
    registry.addEndpoint("/websocket").setAllowedOrigins("*");

    /*
    This endpoint is special as it uses the SockJS fallback protocol which allows a client
    which does not support WebSocket natively mimic a WebSocket over an HTTP connection.
    So for the SockJS endpoint, our connector string would look like http://localhost:8080/sockjs
     */
    registry.addEndpoint("/sockjs")
        .setAllowedOrigins("localhost:3000", "localhost:8080")
        .withSockJS();
  }

  @Override
  public void configureMessageBroker(MessageBrokerRegistry registry) {

    /*
    enable a simple memory-based message broker to carry the greeting messages back to
     the client on destinations prefixed with /topic
     */

    registry.enableSimpleBroker("/topic");

    /*
     designates the /app prefix for messages that are bound for methods annotated with @MessageMapping.
     This prefix will be used to define all the message mappings.
     */
    registry.setApplicationDestinationPrefixes("/app");
  }



}
