package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.monsters.flying;

import de.samuelschwenn.labyrinth_backend.persistence.util.types.DrawableType;
import de.samuelschwenn.labyrinth_backend.persistence.util.types.MonsterType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Lakai extends FlyingMonster{
    @Override
    public DrawableType getType() {
        return MonsterType.MONSTER_LAKAI;
    }
}
