package ru.vsu.cs.novikov.main;

import javafx.scene.shape.Circle;

public class Tile {

    private Circle circle;
    private int line, column;
    private boolean isActive = false;
    private Player player;

    public Tile(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setPlayer(Player player) {
        this.player = player;
        circle = new Circle();
        circle.setRadius(15);
        circle.setCenterX(column * 19.5 + 78);
        circle.setCenterY(line * 34 + 83);
        circle.setFill(player.getColor());
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public boolean isActive() {
        return isActive;
    }
}
