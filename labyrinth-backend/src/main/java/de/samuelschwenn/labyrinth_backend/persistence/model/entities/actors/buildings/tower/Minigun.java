package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.tower;

import de.samuelschwenn.labyrinth_backend.persistence.util.types.DrawableType;
import de.samuelschwenn.labyrinth_backend.persistence.util.types.TowerType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Minigun extends Tower{
    @Override
    public DrawableType getType() {
        return TowerType.TOWER_MINIGUN;
    }
}
