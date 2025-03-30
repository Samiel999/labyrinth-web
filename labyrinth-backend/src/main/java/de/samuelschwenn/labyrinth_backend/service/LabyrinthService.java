package de.samuelschwenn.labyrinth_backend.service;

import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.Building;
import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;

public interface LabyrinthService {
    void initializeGamePrepareForStart();
    void startGame();
    void placeBuilding(GridCoords coords, Building<? extends Building<?>> building);
    void removeBuilding(GridCoords coords);
}
