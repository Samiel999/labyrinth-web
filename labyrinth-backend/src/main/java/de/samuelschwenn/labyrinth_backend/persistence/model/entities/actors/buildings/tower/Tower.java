package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.tower;

import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.Building;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public abstract class Tower<T extends Tower<T>> extends Building<T> {
    protected int reach;
    protected int attackSpeed;
    protected double timeTilShoot;
}
