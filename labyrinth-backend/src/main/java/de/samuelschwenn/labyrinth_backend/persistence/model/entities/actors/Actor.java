package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors;

import de.samuelschwenn.labyrinth_backend.persistence.model.GameState;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.Drawable;
import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class Actor<T extends Actor<T>> implements Drawable {

    protected int strength;
    protected int maxHealth;
    protected int actualHealth;
    protected GridCoords position;

    public abstract T instantiate(GridCoords position);

    @Override
    public GridCoords getGridCoords() {
        return position;
    }

    public void takeDamage(int damage) {
        actualHealth -= damage;
    }

    @Override
    public double getHealth() {
        return ((double) actualHealth) / ((double) maxHealth);
    }

    public void die(GameState gameState) {
        gameState.unregisterDrawable(this);
    }
}
