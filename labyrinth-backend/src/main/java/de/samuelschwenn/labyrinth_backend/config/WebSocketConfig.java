package de.samuelschwenn.labyrinth_backend.config;

import de.samuelschwenn.labyrinth_backend.handler.LabyrinthWebSocketHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    private final LabyrinthWebSocketHandler labyrinthWebSocketHandler;

    public WebSocketConfig(LabyrinthWebSocketHandler labyrinthWebSocketHandler) {
        this.labyrinthWebSocketHandler = labyrinthWebSocketHandler;
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(labyrinthWebSocketHandler, "/game-updates").setAllowedOrigins("*");
    }
}
