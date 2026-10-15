package org.example.ejerciciofxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button btnGeneric;

    @FXML
    protected void onHelloButtonClick() {
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Hello World");
        alert.setHeaderText("Hello World");
        alert.setContentText("Hello World");
        alert.showAndWait();
    }

    @FXML
    public void onBotonCerrar(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void onBotonGeneric(ActionEvent actionEvent) {
    }
}
