package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

    Board board = new Board();
    @FXML
    private Group root;

    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main_application.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root, 620, 720);
        stage.setTitle("Китайские шашки");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void start(Stage stage, String settings) throws Exception {
        start(stage);
        initBoard(settings);
    }

    private void initBoard(String settings) {
        switch (settings) {
            case "2 игрока":
                board.addPlayer(Player.FIRST);
                board.addPlayer(Player.FOURTH);
                break;
            case "4 игрока":
                board.addPlayer(Player.FIRST);
                board.addPlayer(Player.FOURTH);
                board.addPlayer(Player.SECOND);
                board.addPlayer(Player.FIFTH);
                break;
            case "6 игроков":
                board.addPlayer(Player.FIRST);
                board.addPlayer(Player.SECOND);
                board.addPlayer(Player.THIRD);
                board.addPlayer(Player.FOURTH);
                board.addPlayer(Player.FIFTH);
                board.addPlayer(Player.SIXTH);
                break;
        }
        drawBoard();
    }

    private void drawBoard() {
        for (Tile[] t : board.getBoard()) {
            for (Tile t1 : t) {
                if (t1 != null && t1.isActive()) {
                    root.getChildren().add(t1.getCircle());
                }
            }
        }
    }

    public void nextPlayer(ActionEvent actionEvent) {
    }
}