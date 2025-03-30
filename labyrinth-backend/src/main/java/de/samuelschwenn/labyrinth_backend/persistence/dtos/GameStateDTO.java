package de.samuelschwenn.labyrinth_backend.persistence.dtos;

import lombok.Builder;
import lombok.Value;

import java.util.List;

/**
Object will be given as a null value, if there is now game running right now. If there is a game running, but it hasn't
started yet, so the player can still build up their defences, their will be a gameState, but the gameActive will be false
 */
@Value
@Builder
public class GameStateDTO {
    List<DrawableDTO> drawables;
    StaticDataDTO staticData;
    boolean gameActive;
}
