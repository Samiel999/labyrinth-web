package de.samuelschwenn.labyrinth_backend.persistence.model.factories;

import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.base.Base;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.base.DefaultBase;
import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;
import de.samuelschwenn.labyrinth_backend.persistence.util.types.BaseType;

import static de.samuelschwenn.labyrinth_backend.config.entities.BaseConfig.*;

public class BaseFactory {

    private BaseFactory() {}

    public static Base createBase(BaseType type, GridCoords position){
        return switch (type) {
            case BASE_DEFAULT -> getDefaultBase(position);
            // Add more cases for different base types if needed
        };
    }

    private static DefaultBase getDefaultBase(GridCoords position) {
        return DefaultBase.builder()
                .position(position)
                .strength(BASE_STRENGTH_DEFAULT)
                .maxHealth(BASE_HEALTH_DEFAULT)
                .actualHealth(BASE_HEALTH_DEFAULT)
                .cost(BASE_COST_DEFAULT)
                .build();
    }
}
