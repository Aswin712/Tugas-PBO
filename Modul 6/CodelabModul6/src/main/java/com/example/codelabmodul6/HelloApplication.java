package com.example.codelabmodul6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login System");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(7);
        grid.setHgap(10);

        Label welcomeLabel = new Label("Halaman Login");
        welcomeLabel.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        GridPane.setConstraints(welcomeLabel, 0, 0, 8, 1);
        GridPane.setHalignment(welcomeLabel, javafx.geometry.HPos.CENTER);

        Label usernameLabel = new Label("Username:");
        GridPane.setConstraints(usernameLabel, 0, 1);
        TextField usernameInput = new TextField();
        usernameInput.setPromptText("Masukkan username");
        GridPane.setConstraints(usernameInput, 1, 1);

        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 3);
        PasswordField passwordInput = new PasswordField();
        passwordInput.setPromptText("Masukkan password");
        GridPane.setConstraints(passwordInput, 1, 3);

        Button loginButton = new Button("Login");
        GridPane.setConstraints(loginButton, 1, 6);
        GridPane.setHalignment(loginButton, javafx.geometry.HPos.CENTER);

        Label errorLabel = new Label();
        errorLabel.setTextFill(Color.RED);
        GridPane.setConstraints(errorLabel, 1, 9);
        GridPane.setColumnSpan(errorLabel, 2);
        GridPane.setHalignment(errorLabel, javafx.geometry.HPos.CENTER);

        loginButton.setOnAction(e -> {
            if (validateLogin(usernameInput.getText(), passwordInput.getText())) {
                errorLabel.setText("");
                showAlert(AlertType.INFORMATION, "Login Berhasil", "Welcome, " + usernameInput.getText() + "!");
            } else {
                errorLabel.setText("Username/Password salah!");
            }
        });


        grid.getChildren().addAll(welcomeLabel, usernameLabel, usernameInput, passwordLabel, passwordInput, loginButton, errorLabel);


        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private boolean validateLogin(String username, String password) {
        return "Arvin".equals(username) && "admin".equals(password);
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}