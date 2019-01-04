package mutipleScreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Screen1Controller implements BaseController {

    private ScreensController screensController;

    @Override
    public void setParent(ScreensController screensController) {
        this.screensController = screensController;
    }

    @FXML
    public void event1(ActionEvent event) {
        screensController.setScreen(ScreensFramework.screen2ID);
    }

    public void event2(ActionEvent event) {
        screensController.setScreen(ScreensFramework.screen3ID);
    }
}
