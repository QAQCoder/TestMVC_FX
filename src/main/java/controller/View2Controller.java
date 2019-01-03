package controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class View2Controller implements Initializable {

    @FXML JFXButton btn1;
    @FXML StackPane stackPane;

    public StackPane getStackPane() {
        return stackPane;
    }

    public void setStackPane(StackPane stackPane) {
        this.stackPane = stackPane;
    }

    public void initialize(URL location, ResourceBundle resources) {
        btn1.setOnMouseClicked( me -> {
            System.out.println("btn1.........");
        });
    }
}
