package de.samuelschwenn.labyrinth_backend.persistence.model.factories;

import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.monsters.Monster;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.monsters.flying.BombCarrier;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.monsters.flying.Lakai;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.monsters.walking.Boss1;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.monsters.walking.DefaultMonster;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.monsters.walking.Golem;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.monsters.walking.Runner;
import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;
import de.samuelschwenn.labyrinth_backend.persistence.util.types.MonsterType;

import static de.samuelschwenn.labyrinth_backend.config.entities.MonsterConfig.*;

public class MonsterFactory {
    private MonsterFactory() {}

    public static Monster createMonster(MonsterType type, GridCoords position) {
        return switch (type) {
            case MONSTER_RUNNER -> getRunner(position);
            case MONSTER_GOLEM -> getGolem(position);
            case MONSTER_DEFAULT -> getDefaultMonster(position);
            case MONSTER_BOSS_1 -> getBoss1(position);
            case MONSTER_LAKAI -> getLakai(position);
            case MONSTER_BOMB_CARRIER -> getBombCarrier(position);
        };
    }

    private static Runner getRunner(GridCoords position) {
        return Runner.builder()
                .position(position)
                .strength(MONSTER_STRENGTH_RUNNER)
                .maxHealth(MONSTER_HEALTH_RUNNER)
                .actualHealth(MONSTER_HEALTH_RUNNER)
                .movementSpeed(MONSTER_MOVING_SPEED_RUNNER)
                .attackSpeed(MONSTER_ATTACK_SPEED_RUNNER)
                .bounty(MONSTER_BOUNTY_RUNNER)
                .build();
    }

    private static Golem getGolem(GridCoords position) {
        return Golem.builder()
                .position(position)
                .strength(MONSTER_STRENGTH_GOLEM)
                .maxHealth(MONSTER_HEALTH_GOLEM)
                .actualHealth(MONSTER_HEALTH_GOLEM)
                .movementSpeed(MONSTER_MOVING_SPEED_GOLEM)
                .attackSpeed(MONSTER_ATTACK_SPEED_GOLEM)
                .bounty(MONSTER_BOUNTY_GOLEM)
                .build();
    }

    private static DefaultMonster getDefaultMonster(GridCoords position) {
        return DefaultMonster.builder()
                .position(position)
                .strength(MONSTER_STRENGTH_DEFAULT)
                .maxHealth(MONSTER_HEALTH_DEFAULT)
                .actualHealth(MONSTER_HEALTH_DEFAULT)
                .movementSpeed(MONSTER_MOVING_SPEED_DEFAULT)
                .attackSpeed(MONSTER_ATTACK_SPEED_DEFAULT)
                .bounty(MONSTER_BOUNTY_DEFAULT)
                .build();
    }

    private static Boss1 getBoss1(GridCoords position) {
        return Boss1.builder()
                .position(position)
                .strength(MONSTER_STRENGTH_BOSS1)
                .maxHealth(MONSTER_HEALTH_BOSS1)
                .actualHealth(MONSTER_HEALTH_BOSS1)
                .movementSpeed(MONSTER_MOVING_SPEED_BOSS1)
                .attackSpeed(MONSTER_ATTACK_SPEED_BOSS1)
                .bounty(MONSTER_BOUNTY_BOSS1)
                .build();
    }

    private static Lakai getLakai(GridCoords position) {
        return Lakai.builder()
                .position(position)
                .strength(MONSTER_STRENGTH_LAKAI)
                .maxHealth(MONSTER_HEALTH_LAKAI)
                .actualHealth(MONSTER_HEALTH_LAKAI)
                .movementSpeed(MONSTER_MOVING_SPEED_LAKAI)
                .attackSpeed(MONSTER_ATTACK_SPEED_LAKAI)
                .bounty(MONSTER_BOUNTY_LAKAI)
                .build();
    }

    private static BombCarrier getBombCarrier(GridCoords position) {
        return BombCarrier.builder()
                .position(position)
                .strength(MONSTER_STRENGTH_CARRIER)
                .maxHealth(MONSTER_HEALTH_CARRIER)
                .actualHealth(MONSTER_HEALTH_CARRIER)
                .movementSpeed(MONSTER_MOVING_SPEED_CARRIER)
                .attackSpeed(MONSTER_ATTACK_SPEED_CARRIER)
                .bounty(MONSTER_BOUNTY_CARRIER)
                .build();
    }
}
