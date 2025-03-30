package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.wall;

import de.samuelschwenn.labyrinth_backend.persistence.util.DrawableType;
import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import static de.samuelschwenn.labyrinth_backend.GlobalConfig.*;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class DefaultWall extends Wall<DefaultWall> {
    @Override
    public DefaultWall instantiate(GridCoords position) {
        return builder()
                .position(position)
                .strength(WALL_STRENGTH_DEFAULT)
                .maxHealth(WALL_HEALTH_DEFAULT)
                .actualHealth(WALL_HEALTH_DEFAULT)
                .cost(WALL_COST_DEFAULT)
                .build();
    }

    @Override
    public DrawableType getType() {
        return DrawableType.WALL_DEFAULT;
    }
}
