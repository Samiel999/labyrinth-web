package de.samuelschwenn.labyrinth_backend.persistence.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.samuelschwenn.labyrinth_backend.persistence.model.GameState;
import de.samuelschwenn.labyrinth_backend.persistence.dtos.GameStateDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GameStateMapper {
    @BeanMapping(ignoreByDefault = false)
    GameStateDTO mapGameStateToGameStateDTO(GameState gameState);

    @BeanMapping(ignoreByDefault = false)
    default String mapGameStateDTOToString(GameStateDTO gameStateDTO) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(gameStateDTO);
    }
}
