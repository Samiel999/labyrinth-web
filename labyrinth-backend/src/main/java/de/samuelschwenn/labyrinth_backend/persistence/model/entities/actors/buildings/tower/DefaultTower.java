package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.tower;

import de.samuelschwenn.labyrinth_backend.persistence.util.types.DrawableType;
import de.samuelschwenn.labyrinth_backend.persistence.util.types.TowerType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class DefaultTower extends Tower {
    @Override
    public DrawableType getType() {
        return TowerType.TOWER_DEFAULT;
    }
}
