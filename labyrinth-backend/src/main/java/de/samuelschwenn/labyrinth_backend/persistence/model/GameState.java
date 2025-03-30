package de.samuelschwenn.labyrinth_backend.persistence.model;

import de.samuelschwenn.labyrinth_backend.persistence.model.entities.Drawable;
import lombok.Data;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Data
public class GameState {
    List<Drawable> drawables = new CopyOnWriteArrayList<>();
    boolean gameOver;
    boolean gameActive;

    public void registerDrawable(Drawable drawable) {
        drawables.add(drawable);
    }

    public void unregisterDrawable(Drawable drawable) {
        drawables.remove(drawable);
    }
}
