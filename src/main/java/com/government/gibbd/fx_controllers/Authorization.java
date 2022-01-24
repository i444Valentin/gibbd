package com.government.gibbd.fx_controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.stereotype.Component;

@Component
public class Authorization {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onSingInButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}