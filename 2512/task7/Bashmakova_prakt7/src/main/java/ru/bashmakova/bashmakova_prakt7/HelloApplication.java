package ru.bashmakova.bashmakova_prakt7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import static ru.bashmakova.bashmakova_prakt7.util.Manager.showMainStage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        showMainStage(stage, "one-view.fxml","Marathon Skills 2016");
    }

    public static void main(String[] args) {
        launch();
    }
}