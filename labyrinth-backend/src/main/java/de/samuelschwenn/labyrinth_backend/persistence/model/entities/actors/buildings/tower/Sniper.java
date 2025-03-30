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
public class Sniper extends Tower<Sniper> {

    @Override
    public Sniper instantiate(GridCoords position) {
        return builder()
                .position(position)
                .strength(TOWER_STRENGTH_SNIPER)
                .maxHealth(TOWER_HEALTH_SNIPER)
                .actualHealth(TOWER_HEALTH_SNIPER)
                .cost(TOWER_COST_SNIPER)
                .reach(TOWER_REACH_SNIPER)
                .attackSpeed(TOWER_SPEED_SNIPER)
                .timeTilShoot(TOWER_SPEED_SNIPER)
                .build();
    }

    @Override
    public DrawableType getType() {
        return DrawableType.TOWER_SNIPER;
    }
}
