package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.monsters;

import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.Actor;
import de.samuelschwenn.labyrinth_backend.persistence.util.Direction;
import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public abstract class Monster extends Actor {
    protected double movementSpeed;
    protected int attackSpeed;
    protected double bounty;
    protected double pathWeight;
    protected List<GridCoords> path;
    protected Direction facing;
    protected double progressToNextCoordinate;

    @Override
    public Direction getFacing() {
        return facing;
    }
}
