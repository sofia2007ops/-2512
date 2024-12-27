package ru.bashmakova.bashmakova_prakt7.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.bashmakova.bashmakova_prakt7.util.Manager.*;

public class Dva {

    @FXML
    private Button BackB;

    @FXML
    private Button Login;

    @FXML
    private Button NewB;

    @FXML
    private Button OldB;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("one-view.fxml","Marathon Skills 2016");

    }

    @FXML
    void Login(ActionEvent event) {
        showSecondScene("tri-view.fxml","Marathon Skills 2016");

    }

    @FXML
    void NewB(ActionEvent event) {
        showSecondScene("chetere-view.fxml","Marathon Skills 2016");

    }

    @FXML
    void OldB(ActionEvent event) {
        showSecondScene("tri-view.fxml","Marathon Skills 2016");

    }

}
