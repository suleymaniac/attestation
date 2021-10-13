package ru.vsu.cs.novikov.main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @FXML
    ChoiceBox<String> choiceBox;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void onHelloButtonClick(ActionEvent actionEvent) throws Exception {
        Stage stage = (Stage) choiceBox.getScene().getWindow();
        stage.close();
        new MainApplication().start(stage, choiceBox.getValue());
    }
}