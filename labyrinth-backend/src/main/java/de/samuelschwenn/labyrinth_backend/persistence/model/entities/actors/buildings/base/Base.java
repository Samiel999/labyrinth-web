package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.base;

import de.samuelschwenn.labyrinth_backend.persistence.model.GameState;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.Building;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public abstract class Base extends Building {
    @Override
    public void die(GameState gameState) {
        super.die(gameState);
        gameState.setGameOver(true);
        gameState.setGameActive(false);
    }
}
