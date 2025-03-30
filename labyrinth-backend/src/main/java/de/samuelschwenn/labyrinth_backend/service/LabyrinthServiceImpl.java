package de.samuelschwenn.labyrinth_backend.service;

import de.samuelschwenn.labyrinth_backend.persistence.model.GameState;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.Building;
import de.samuelschwenn.labyrinth_backend.persistence.model.factories.LevelFactory;
import de.samuelschwenn.labyrinth_backend.persistence.model.LevelSpecificData;
import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;
import de.samuelschwenn.labyrinth_backend.persistence.util.types.BaseType;
import org.springframework.stereotype.Service;

@Service
public class LabyrinthServiceImpl implements LabyrinthService {
    private GameState gameState = null;
    private BaseType currentBaseType = BaseType.BASE_DEFAULT;
    private int selectedLevel = 1;

    @Override
    public void initializeGamePrepareForStart() {
        LevelSpecificData levelData = LevelFactory.createLevelSpecificData(selectedLevel);
        gameState = new GameState(levelData, currentBaseType);
    }

    @Override
    public void selectLevel(int level) {
        selectedLevel = level;
    }

    @Override
    public void startGame() {

    }

    @Override
    public void placeBuilding(GridCoords coords, Building building) {

    }

    @Override
    public void removeBuilding(GridCoords coords) {

    }
}
