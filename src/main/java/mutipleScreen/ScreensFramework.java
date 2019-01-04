package mutipleScreen;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScreensFramework extends Application {

    public static String screen1ID = "main";
    public static String screen1File = "fxml/screen1.fxml";
    public static String screen2ID = "screen2";
    public static String screen2File = "fxml/screen2.fxml";
    public static String screen3ID = "screen3";
    public static String screen3File = "fxml/screen3.fxml";

    ScreensController screensController = new ScreensController();

    @Override
    public void start(Stage primaryStage) throws Exception {
        screensController.loadScreen(ScreensFramework.screen1ID, ScreensFramework.screen1File);
        screensController.loadScreen(ScreensFramework.screen2ID, ScreensFramework.screen2File);
        screensController.loadScreen(ScreensFramework.screen2ID, ScreensFramework.screen3File);

        screensController.setScreen(ScreensFramework.screen1ID);

        screensController.setScreen(ScreensFramework.screen1ID);
        Group group = new Group(screensController);
        primaryStage.setScene(new Scene(group));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
