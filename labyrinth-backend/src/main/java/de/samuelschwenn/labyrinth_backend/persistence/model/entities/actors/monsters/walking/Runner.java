package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.monsters.walking;

import de.samuelschwenn.labyrinth_backend.persistence.util.types.DrawableType;
import de.samuelschwenn.labyrinth_backend.persistence.util.types.MonsterType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Runner extends WalkingMonster {
    @Override
    public DrawableType getType() {
        return MonsterType.MONSTER_RUNNER;
    }
}
