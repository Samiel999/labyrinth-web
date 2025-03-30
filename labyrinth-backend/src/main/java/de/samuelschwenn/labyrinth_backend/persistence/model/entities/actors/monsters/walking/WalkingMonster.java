package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.monsters.walking;

import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.monsters.Monster;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public abstract class WalkingMonster extends Monster {
}
