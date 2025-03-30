package de.samuelschwenn.labyrinth_backend.persistence.model;

import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;
import lombok.Builder;
import lombok.Value;
import org.javatuples.Pair;

import java.util.List;

@Value
@Builder
public class StaticData {
    int width;
    int height;
    int currentLevel;
    int timeToSpawn;
    List<Pair<GridCoords, GridCoords>> spawnArea;
}
