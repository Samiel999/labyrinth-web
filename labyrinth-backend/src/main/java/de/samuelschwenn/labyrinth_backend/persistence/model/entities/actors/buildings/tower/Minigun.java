package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.tower;

import de.samuelschwenn.labyrinth_backend.persistence.util.DrawableType;
import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import static de.samuelschwenn.labyrinth_backend.GlobalConfig.*;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Minigun extends Tower<Minigun>{

    @Override
    public Minigun instantiate(GridCoords position) {
        return builder()
                .position(position)
                .strength(TOWER_STRENGTH_MINIGUN)
                .maxHealth(TOWER_HEALTH_MINIGUN)
                .actualHealth(TOWER_HEALTH_MINIGUN)
                .cost(TOWER_COST_MINIGUN)
                .reach(TOWER_REACH_MINIGUN)
                .attackSpeed(TOWER_SPEED_MINIGUN)
                .timeTilShoot(TOWER_SPEED_MINIGUN)
                .build();
    }

    @Override
    public DrawableType getType() {
        return DrawableType.TOWER_MINIGUN;
    }
}
