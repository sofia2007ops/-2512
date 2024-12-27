package ru.bashmakova.bashmakova_prakt7.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static ru.bashmakova.bashmakova_prakt7.util.Manager.showSecondScene;

public class Chetere {

    @FXML
    private Button BackB;

    @FXML
    private Button Cancel;

    @FXML
    private TextField email;

    @FXML
    private TextField pass;

    @FXML
    private Button reg;

    private static String registeredEmail;
    private static String registeredPassword;

    @FXML
    void BackB(ActionEvent event) {
        showSecondScene("one-view.fxml", "Marathon Skills 2016");
    }

    @FXML
    void Cancel(ActionEvent event) {
        showSecondScene("dva-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void reg(ActionEvent event) {
        showSecondScene("five-view.fxml", "Marathon Skills 2016");
        String emailInput = email.getText().trim();
        String passwordInput = pass.getText().trim();

        if (emailInput.isEmpty() || passwordInput.isEmpty()) {
            return;
        }

        registeredEmail = emailInput;
        registeredPassword = passwordInput;

    }

    public static String getRegisteredEmail() {
        return registeredEmail;
    }

    public static String getRegisteredPassword() {
        return registeredPassword;
    }
}
