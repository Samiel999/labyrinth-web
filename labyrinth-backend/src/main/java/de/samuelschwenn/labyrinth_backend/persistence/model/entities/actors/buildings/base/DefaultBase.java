package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.base;

import de.samuelschwenn.labyrinth_backend.persistence.util.DrawableType;
import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import static de.samuelschwenn.labyrinth_backend.GlobalConfig.*;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class DefaultBase extends Base<DefaultBase>{
    @Override
    public DefaultBase instantiate(GridCoords position) {
        return builder()
                .position(position)
                .strength(BASE_STRENGTH_DEFAULT)
                .maxHealth(BASE_HEALTH_DEFAULT)
                .actualHealth(BASE_HEALTH_DEFAULT)
                .cost(BASE_COST_DEFAULT)
                .build();
    }

    @Override
    public DrawableType getType() {
        return DrawableType.BASE_DEFAULT;
    }
}
