package ru.bashmakova.bashmakova_prakt7.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.bashmakova.bashmakova_prakt7.util.Manager.showSecondScene;

public class Six {

    @FXML
    private Button BackB;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("one-view.fxml","Marathon Skills 2016");

    }
}