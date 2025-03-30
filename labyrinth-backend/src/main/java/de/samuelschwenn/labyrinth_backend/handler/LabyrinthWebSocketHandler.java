package de.samuelschwenn.labyrinth_backend.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.samuelschwenn.labyrinth_backend.persistence.mapper.GameStateMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.concurrent.CopyOnWriteArraySet;

@Component
@RequiredArgsConstructor
public class LabyrinthWebSocketHandler extends TextWebSocketHandler {

    private final CopyOnWriteArraySet<WebSocketSession> sessions = new CopyOnWriteArraySet<>();
    private final ObjectMapper objectMapper;
    private final GameStateMapper gameStateMapper;

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        sessions.add(session);
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        // Handle messages from clients if needed
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, org.springframework.web.socket.CloseStatus status) {
        sessions.remove(session);
    }

    // Simulate game state updates (every second)
    @Scheduled(fixedRate = 100)
    public void sendGameUpdates() throws Exception {

        for (WebSocketSession session : sessions) {
            if (session.isOpen()) {
                session.sendMessage(new TextMessage(""));
            }
        }
    }


}
