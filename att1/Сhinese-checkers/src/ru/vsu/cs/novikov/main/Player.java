package ru.vsu.cs.novikov.main;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public enum Player {
    FIRST(new Tile[]{
            new Tile(0, 12),
            new Tile(1, 11),
            new Tile(1, 13),
            new Tile(2, 10),
            new Tile(2, 12),
            new Tile(2, 14),
            new Tile(3, 9),
            new Tile(3, 11),
            new Tile(3, 13),
            new Tile(3, 15)}, Color.ORANGE),
    SECOND(new Tile[]{
            new Tile(4, 18),
            new Tile(4, 20),
            new Tile(4, 22),
            new Tile(4, 24),
            new Tile(5, 19),
            new Tile(5, 21),
            new Tile(5, 23),
            new Tile(6, 20),
            new Tile(6, 22),
            new Tile(7, 21)}, Color.GRAY),
    THIRD(new Tile[]{
            new Tile(9, 21),
            new Tile(10, 20),
            new Tile(10, 22),
            new Tile(11, 19),
            new Tile(11, 21),
            new Tile(11, 23),
            new Tile(12, 18),
            new Tile(12, 20),
            new Tile(12, 22),
            new Tile(12, 24)}, Color.AQUA),
    FOURTH(new Tile[]{
            new Tile(13, 9),
            new Tile(13, 11),
            new Tile(13, 13),
            new Tile(13, 15),
            new Tile(14, 10),
            new Tile(14, 12),
            new Tile(14, 14),
            new Tile(15, 11),
            new Tile(15, 13),
            new Tile(16, 12)}, Color.GREEN),
    FIFTH(new Tile[]{
            new Tile(12, 0),
            new Tile(12, 2),
            new Tile(12, 4),
            new Tile(12, 6),
            new Tile(11, 1),
            new Tile(11, 3),
            new Tile(11, 5),
            new Tile(10, 2),
            new Tile(10, 4),
            new Tile(9, 3)}, Color.BROWN),
    SIXTH(new Tile[]{
            new Tile(7, 3),
            new Tile(6, 2),
            new Tile(6, 4),
            new Tile(5, 1),
            new Tile(5, 3),
            new Tile(5, 5),
            new Tile(4, 0),
            new Tile(4, 2),
            new Tile(4, 4),
            new Tile(4, 6)}, Color.BLUE);

    private final Tile[] activeTile;
    private final Tile[] homeTile;
    private final Paint color;

    Player(Tile[] homeTile, Paint color) {
        this.activeTile = homeTile.clone();
        this.homeTile = homeTile;
        this.color = color;
    }

    public Tile[] getActiveTile() {
        return activeTile;
    }

    public Tile[] getHomeTile() {
        return homeTile;
    }

    public Paint getColor() {
        return color;
    }
}
