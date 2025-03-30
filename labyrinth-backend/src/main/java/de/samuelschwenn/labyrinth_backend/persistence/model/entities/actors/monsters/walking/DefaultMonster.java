package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.monsters.walking;

import de.samuelschwenn.labyrinth_backend.persistence.util.types.DrawableType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import static de.samuelschwenn.labyrinth_backend.persistence.util.types.MonsterType.MONSTER_DEFAULT;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class DefaultMonster extends WalkingMonster {
    @Override
    public DrawableType getType() {
        return MONSTER_DEFAULT;
    }
}
