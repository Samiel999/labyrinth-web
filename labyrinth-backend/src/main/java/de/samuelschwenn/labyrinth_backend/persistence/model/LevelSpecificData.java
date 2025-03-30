package de.samuelschwenn.labyrinth_backend.persistence.model;

import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;
import de.samuelschwenn.labyrinth_backend.persistence.util.types.MonsterType;
import lombok.Data;
import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.List;

import static de.samuelschwenn.labyrinth_backend.config.LevelConfig.*;

@Data
public class LevelSpecificData {
    protected final int levelNumber;
    protected List<MonsterType> monstersToSpawn = new ArrayList<>();
    protected int timeToSpawn = LEVEL_TIME_TO_SPAWN_DEFAULT;
    protected int width = LEVEL_WIDTH_DEFAULT;
    protected int height = LEVEL_HEIGHT_DEFAULT;
    protected GridCoords basePosition = LEVEL_BASE_POSITION_DEFAULT;
    protected int numberOfWalls = LEVEL_NUMBER_OF_WALLS_DEFAULT;
    protected int startingCapital = LEVEL_STARTING_CAPITAL_DEFAULT;
    protected List<Pair<GridCoords, GridCoords>> spawnArea = LEVEL_SPAWN_AREA_DEFAULT;

    public void addNumberOfMonstersToSpawnList(int count, MonsterType monsterType) {
        for(int i = 0; i < count; i++) {
            monstersToSpawn.add(monsterType);
        }
    }
}
