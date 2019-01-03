package controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML JFXButton btn1;
    @FXML TilePane tilePane;

    public TilePane getTilePane() {
        return tilePane;
    }

    public void setTilePane(TilePane tilePane) {
        this.tilePane = tilePane;
    }

    public void say() {
        System.out.println(123);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btn1.setOnAction( me -> {
            getTilePane().getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader(ClassLoader.getSystemResource("fxml/view2.fxml"));
            try {
                loader.load();
            } catch (IOException e) { e.printStackTrace(); }

            View2Controller vc2 = loader.getController();
            Stage stage = new Stage();
            System.out.println(vc2.getStackPane());
            stage.setScene(new Scene(vc2.getStackPane()));
            stage.setAlwaysOnTop(true);
            stage.centerOnScreen();
            stage.show();
        });
    }
}
