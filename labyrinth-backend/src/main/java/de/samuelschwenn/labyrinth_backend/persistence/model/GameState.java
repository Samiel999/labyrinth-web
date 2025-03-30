package de.samuelschwenn.labyrinth_backend.persistence.model;

import de.samuelschwenn.labyrinth_backend.persistence.model.entities.Drawable;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.base.Base;
import de.samuelschwenn.labyrinth_backend.persistence.model.factories.BaseFactory;
import de.samuelschwenn.labyrinth_backend.persistence.util.types.BaseType;
import lombok.Data;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Data
public class GameState {
    private List<Drawable> drawables = new CopyOnWriteArrayList<>();
    private Base base;
    private boolean gameOver = false;
    private boolean gameActive = false;
    private int numberOfWalls;
    private int money;
    private StaticData staticData;

    public GameState(LevelSpecificData levelData, BaseType baseType) {
        staticData = StaticData.builder()
                .width(levelData.getWidth())
                .height(levelData.getHeight())
                .currentLevel(levelData.getLevelNumber())
                .timeToSpawn(levelData.getTimeToSpawn())
                .spawnArea(levelData.getSpawnArea())
                .build();
        base = BaseFactory.createBase(baseType, levelData.getBasePosition());
        registerDrawable(base);
        numberOfWalls = levelData.getNumberOfWalls();
        money = levelData.getStartingCapital();
    }

    public void registerDrawable(Drawable drawable) {
        drawables.add(drawable);
    }

    public void unregisterDrawable(Drawable drawable) {
        drawables.remove(drawable);
    }
}
