package de.samuelschwenn.labyrinth_backend.persistence.model.factories;

import de.samuelschwenn.labyrinth_backend.persistence.model.LevelSpecificData;

import static de.samuelschwenn.labyrinth_backend.persistence.util.types.MonsterType.*;
import static de.samuelschwenn.labyrinth_backend.persistence.util.types.MonsterType.MONSTER_RUNNER;

public class LevelFactory {
    private LevelFactory() {}

    public static LevelSpecificData createLevelSpecificData(int levelNumber) {
        return switch (levelNumber) {
            case 1 -> level1();
            case 2 -> level2();
            case 3 -> level3();
            case 4 -> level4();
            case 5 -> level5();
            default -> throw new IllegalArgumentException("Invalid level number: " + levelNumber);
        };
    }

    private static LevelSpecificData level1() {
        LevelSpecificData level = new LevelSpecificData(1);
        level.addNumberOfMonstersToSpawnList(15, MONSTER_DEFAULT);
        return level;
    }

    private static LevelSpecificData level2() {
        LevelSpecificData level = new LevelSpecificData(2);
        level.addNumberOfMonstersToSpawnList(8, MONSTER_DEFAULT);
        level.addNumberOfMonstersToSpawnList(4, MONSTER_LAKAI);
        level.addNumberOfMonstersToSpawnList(8, MONSTER_DEFAULT);
        level.addNumberOfMonstersToSpawnList(4, MONSTER_LAKAI);
        return level;
    }

    private static LevelSpecificData level3() {
        LevelSpecificData level = new LevelSpecificData(3);
        level.addNumberOfMonstersToSpawnList(11, MONSTER_DEFAULT);
        level.addNumberOfMonstersToSpawnList(2, MONSTER_GOLEM);
        level.addNumberOfMonstersToSpawnList(3, MONSTER_LAKAI);
        level.addNumberOfMonstersToSpawnList(6, MONSTER_RUNNER);
        level.setNumberOfWalls(30);
        return level;
    }

    private static LevelSpecificData level4() {
        LevelSpecificData level = new LevelSpecificData(4);
        level.addNumberOfMonstersToSpawnList(6, MONSTER_LAKAI);
        level.addNumberOfMonstersToSpawnList(2, MONSTER_BOMB_CARRIER);
        level.setStartingCapital(140);
        return level;
    }

    private static LevelSpecificData level5() {
        LevelSpecificData level = new LevelSpecificData(5);
        level.addNumberOfMonstersToSpawnList(4, MONSTER_LAKAI);
        level.addNumberOfMonstersToSpawnList(5, MONSTER_RUNNER);
        level.addNumberOfMonstersToSpawnList(1, MONSTER_BOSS_1);
        return level;
    }
}
