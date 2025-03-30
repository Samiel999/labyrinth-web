package de.samuelschwenn.labyrinth_backend.config;

import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;
import org.javatuples.Pair;

import java.util.List;

public final class LevelConfig {
    private LevelConfig() {}

    public static final int LEVEL_NUMBER_1 = 1;
    public static final int LEVEL_NUMBER_2 = 2;
    public static final int LEVEL_NUMBER_3 = 3;
    public static final int LEVEL_NUMBER_4 = 4;
    public static final int LEVEL_NUMBER_5 = 5;

    public static final int LEVEL_TIME_TO_SPAWN_DEFAULT = 3;
    public static final int LEVEL_WIDTH_DEFAULT = 39;
    public static final int LEVEL_HEIGHT_DEFAULT = 21;
    public static final GridCoords LEVEL_BASE_POSITION_DEFAULT = new GridCoords(19, 10);
    public static final int LEVEL_NUMBER_OF_WALLS_DEFAULT = 20;
    public static final int LEVEL_STARTING_CAPITAL_DEFAULT = 80;

    private static final Pair<GridCoords, GridCoords> LEVEL_SPAWN_AREA_TOP_DEFAULT = new Pair<>(new GridCoords(0, 0), new GridCoords(0, LEVEL_HEIGHT_DEFAULT - 1));
    private static final Pair<GridCoords, GridCoords> LEVEL_SPAWN_AREA_BOTTOM_DEFAULT = new Pair<>(new GridCoords(0, LEVEL_HEIGHT_DEFAULT - 1), new GridCoords(LEVEL_WIDTH_DEFAULT - 1, LEVEL_HEIGHT_DEFAULT - 1));
    private static final Pair<GridCoords, GridCoords> LEVEL_SPAWN_AREA_LEFT_DEFAULT = new Pair<>(new GridCoords(0, 0), new GridCoords(LEVEL_WIDTH_DEFAULT - 1, 0));
    private static final Pair<GridCoords, GridCoords> LEVEL_SPAWN_AREA_RIGHT_DEFAULT = new Pair<>(new GridCoords(LEVEL_WIDTH_DEFAULT - 1, 0), new GridCoords(LEVEL_WIDTH_DEFAULT - 1, LEVEL_HEIGHT_DEFAULT - 1));

    public static final List<Pair<GridCoords, GridCoords>> LEVEL_SPAWN_AREA_DEFAULT = List.of(
            LEVEL_SPAWN_AREA_TOP_DEFAULT,
            LEVEL_SPAWN_AREA_BOTTOM_DEFAULT,
            LEVEL_SPAWN_AREA_LEFT_DEFAULT,
            LEVEL_SPAWN_AREA_RIGHT_DEFAULT
    );
}
