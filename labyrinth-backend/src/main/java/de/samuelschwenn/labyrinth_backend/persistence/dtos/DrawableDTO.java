package de.samuelschwenn.labyrinth_backend.persistence.dtos;

import de.samuelschwenn.labyrinth_backend.persistence.util.Direction;
import de.samuelschwenn.labyrinth_backend.persistence.util.types.DrawableType;
import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class DrawableDTO {
    DrawableType type;
    GridCoords coords;
    double health; // Health is given as a fraction, where 1 == full health and 0 == death
    Direction facing;
    double progressToNextCoordinate;
}
