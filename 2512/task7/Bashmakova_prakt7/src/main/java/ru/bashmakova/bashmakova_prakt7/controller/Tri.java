package ru.bashmakova.bashmakova_prakt7.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static ru.bashmakova.bashmakova_prakt7.util.Manager.showSecondScene;

public class Tri {

    @FXML
    private Button BackB;

    @FXML
    private Button Cancel;

    @FXML
    private TextField emailcheck;

    @FXML
    private Button login;

    @FXML
    private TextField passcheck;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("one-view.fxml", "Marathon Skills 2016");
    }

    @FXML
    void Cancel(ActionEvent event) {
        showSecondScene("dva-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void login(ActionEvent event) {
        String emailInput = emailcheck.getText().trim();
        String passwordInput = passcheck.getText().trim();

        String registeredEmail = Chetere.getRegisteredEmail();
        String registeredPassword = Chetere.getRegisteredPassword();

        if (registeredEmail == null || registeredPassword == null) {

            return;
        }

        if (emailInput.equals(registeredEmail) && passwordInput.equals(registeredPassword)) {

            showSecondScene("five-view.fxml", "Marathon Skills 2016 - Register as a runner");
        }
    }
}
