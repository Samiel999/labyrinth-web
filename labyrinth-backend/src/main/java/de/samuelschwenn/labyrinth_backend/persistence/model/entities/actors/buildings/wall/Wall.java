package de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.wall;

import de.samuelschwenn.labyrinth_backend.persistence.model.entities.actors.buildings.Building;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public abstract class Wall extends Building {
}
