package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings;

import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.Actor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public abstract class Building extends Actor {
    protected double cost;
}
