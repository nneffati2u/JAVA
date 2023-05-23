package com.example.td_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label test;

    @FXML
    private TableView tableau;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}