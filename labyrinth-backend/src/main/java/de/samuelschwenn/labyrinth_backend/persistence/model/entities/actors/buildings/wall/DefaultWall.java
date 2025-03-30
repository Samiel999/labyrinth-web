package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.wall;

import de.samuelschwenn.labyrinth_backend.persistence.util.types.DrawableType;
import de.samuelschwenn.labyrinth_backend.persistence.util.types.WallType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class DefaultWall extends Wall {
    @Override
    public DrawableType getType() {
        return WallType.WALL_DEFAULT;
    }
}
