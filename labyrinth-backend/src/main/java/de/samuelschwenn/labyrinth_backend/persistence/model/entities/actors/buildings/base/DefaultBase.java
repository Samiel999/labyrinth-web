package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.base;

import de.samuelschwenn.labyrinth_backend.persistence.util.types.BaseType;
import de.samuelschwenn.labyrinth_backend.persistence.util.types.DrawableType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class DefaultBase extends Base {
    @Override
    public DrawableType getType() {
        return BaseType.BASE_DEFAULT;
    }
}
