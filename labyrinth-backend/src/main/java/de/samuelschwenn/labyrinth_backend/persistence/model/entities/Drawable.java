package de.samuelschwenn.labyrinth_backend.persistence.model.entities;

import de.samuelschwenn.labyrinth_backend.persistence.util.Direction;
import de.samuelschwenn.labyrinth_backend.persistence.util.DrawableType;
import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;

public interface Drawable {
    DrawableType getType();
    GridCoords getGridCoords();
    default double getHealth() {return 0;}
    default Direction getFacing() {return Direction.NORTH;}
    default double getProgressToNextCoordinate() {return 0;}
}
