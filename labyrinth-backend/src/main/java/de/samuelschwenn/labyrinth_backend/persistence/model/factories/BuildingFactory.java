package de.samuelschwenn.labyrinth_backend.persistence.model.factories;

import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.Building;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.tower.DefaultTower;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.tower.Minigun;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.tower.Sniper;
import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.wall.DefaultWall;
import de.samuelschwenn.labyrinth_backend.persistence.util.GridCoords;
import de.samuelschwenn.labyrinth_backend.persistence.util.types.BuildingType;

import static de.samuelschwenn.labyrinth_backend.config.entities.TowerConfig.*;
import static de.samuelschwenn.labyrinth_backend.config.entities.WallConfig.*;
import static de.samuelschwenn.labyrinth_backend.persistence.util.types.BaseType.BASE_DEFAULT;
import static de.samuelschwenn.labyrinth_backend.persistence.util.types.TowerType.*;
import static de.samuelschwenn.labyrinth_backend.persistence.util.types.WallType.WALL_DEFAULT;

public class BuildingFactory {
    private BuildingFactory() {}

    public static Building createBuilding(BuildingType type, GridCoords position) {
        return switch (type) {
            case BASE_DEFAULT -> BaseFactory.createBase(BASE_DEFAULT, position);
            case TOWER_DEFAULT -> getDefaultTower(position);
            case TOWER_MINIGUN -> getMinigun(position);
            case TOWER_SNIPER -> getSniper(position);
            case WALL_DEFAULT -> getDefaultWall(position);
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }

    private static DefaultTower getDefaultTower(GridCoords position) {
        return DefaultTower.builder()
                .position(position)
                .strength(TOWER_STRENGTH_DEFAULT)
                .maxHealth(TOWER_HEALTH_DEFAULT)
                .actualHealth(TOWER_HEALTH_DEFAULT)
                .cost(TOWER_COST_DEFAULT)
                .reach(TOWER_REACH_DEFAULT)
                .attackSpeed(TOWER_SPEED_DEFAULT)
                .timeTilShoot(TOWER_SPEED_DEFAULT)
                .build();
    }

    private static Minigun getMinigun(GridCoords position) {
        return Minigun.builder()
                .position(position)
                .strength(TOWER_STRENGTH_MINIGUN)
                .maxHealth(TOWER_HEALTH_MINIGUN)
                .actualHealth(TOWER_HEALTH_MINIGUN)
                .cost(TOWER_COST_MINIGUN)
                .reach(TOWER_REACH_MINIGUN)
                .attackSpeed(TOWER_SPEED_MINIGUN)
                .timeTilShoot(TOWER_SPEED_MINIGUN)
                .build();
    }

    private static Sniper getSniper(GridCoords position) {
        return Sniper.builder()
                .position(position)
                .strength(TOWER_STRENGTH_SNIPER)
                .maxHealth(TOWER_HEALTH_SNIPER)
                .actualHealth(TOWER_HEALTH_SNIPER)
                .cost(TOWER_COST_SNIPER)
                .reach(TOWER_REACH_SNIPER)
                .attackSpeed(TOWER_SPEED_SNIPER)
                .timeTilShoot(TOWER_SPEED_SNIPER)
                .build();
    }

    private static DefaultWall getDefaultWall(GridCoords position) {
        return DefaultWall.builder()
                .position(position)
                .strength(WALL_STRENGTH_DEFAULT)
                .maxHealth(WALL_HEALTH_DEFAULT)
                .actualHealth(WALL_HEALTH_DEFAULT)
                .cost(WALL_COST_DEFAULT)
                .build();
    }
}
