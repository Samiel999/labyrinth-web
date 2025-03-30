package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.tower;

import de.samuelschwenn.labyrinth_backend.persistence.util.DrawableType;
import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import static de.samuelschwenn.labyrinth_backend.GlobalConfig.*;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class DefaultTower extends Tower<DefaultTower> {

    @Override
    public DefaultTower instantiate(GridCoords position) {
        return builder()
                .position(position)
                .strength(TOWER_STRENGTH_DEFAULT)
                .maxHealth(TOWER_HEALTH_DEFAULT)
                .actualHealth(TOWER_HEALTH_DEFAULT)
                .cost(TOWER_COST_DEFAULT)
                .reach(TOWER_REACH_DEFAULT)
                .attackSpeed(TOWER_SPEED_DEFAULT)
                .timeTilShoot(TOWER_SPEED_DEFAULT)
                .build();
    }

    @Override
    public DrawableType getType() {
        return DrawableType.TOWER_DEFAULT;
    }
}
