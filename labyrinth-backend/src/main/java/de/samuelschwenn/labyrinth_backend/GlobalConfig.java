package de.samuelschwenn.labyrinth_backend;

public final class GlobalConfig {
    private GlobalConfig() {}

    // Base Default
    public static final int BASE_STRENGTH_DEFAULT = 0;
    public static final int BASE_HEALTH_DEFAULT = 200;
    public static final int BASE_COST_DEFAULT = 0;

    // Tower Default
    public static final int TOWER_STRENGTH_DEFAULT = 5;
    public static final int TOWER_HEALTH_DEFAULT = 25;
    public static final int TOWER_COST_DEFAULT = 20;
    public static final int TOWER_REACH_DEFAULT = 4;
    public static final int TOWER_SPEED_DEFAULT = 6;

    // Tower Minigun
    public static final int TOWER_STRENGTH_MINIGUN = 2;
    public static final int TOWER_HEALTH_MINIGUN = 25;
    public static final int TOWER_COST_MINIGUN = 40;
    public static final int TOWER_REACH_MINIGUN = 5;
    public static final int TOWER_SPEED_MINIGUN = 1;

    // Tower Sniper
    public static final int TOWER_STRENGTH_SNIPER = 20;
    public static final int TOWER_HEALTH_SNIPER = 25;
    public static final int TOWER_COST_SNIPER = 50;
    public static final int TOWER_REACH_SNIPER = 8;
    public static final int TOWER_SPEED_SNIPER = 10;

    // Wall Default
    public static final int WALL_STRENGTH_DEFAULT = 0;
    public static final int WALL_HEALTH_DEFAULT = 10;
    public static final int WALL_COST_DEFAULT = 0;
}
