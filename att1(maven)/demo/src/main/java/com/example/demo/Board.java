package com.example.demo;

public class Board {
    private final int COLUMN = 25;
    private final int LINE = 17;
    private Tile[][] board;

    public Board() {
        board = new Tile[LINE][COLUMN];
        int line = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = COLUMN / 2 - i; j <= COLUMN / 2 + i; j += 2) {
                board[line][j] = new Tile(line, j);
            }
            line++;
        }
        for (int i = 12; i >= 8; i--) {
            for (int j = COLUMN / 2 - i; j <= COLUMN / 2 + i; j += 2) {
                board[line][j] = new Tile(line, j);
            }
            line++;
        }

        for (int i = 9; i <= 12; i++) {
            for (int j = COLUMN / 2 - i; j <= COLUMN / 2 + i; j += 2) {
                board[line][j] = new Tile(line, j);
            }
            line++;
        }

        for (int i = 3; i >= 0; i--) {
            for (int j = COLUMN / 2 - i; j <= COLUMN / 2 + i; j += 2) {
                board[line][j] = new Tile(line, j);
            }
            line++;
        }
    }

    void addPlayer(Player player) {
        for (Tile tile : player.getHomeTile()) {
            board[tile.getLine()][tile.getColumn()].setActive(true);
            board[tile.getLine()][tile.getColumn()].setPlayer(player);
        }
    }

    public Tile[][] getBoard() {
        return board;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Tile[] line : board) {
            for (Tile el : line) {
                if (el == null) {
                    str.append(" ");
                } else if (el.isActive()) {
                    str.append("+");
                } else {
                    str.append("-");
                }
            }
            str.append("\n");
        }
        return str.toString();
    }
}
