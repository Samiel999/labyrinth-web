package de.samuelschwenn.labyrinth_backend.persistence.dtos;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class StaticDataDTO {
    int width;
    int height;
    int currentLevel;
}
