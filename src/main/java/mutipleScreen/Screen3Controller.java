package mutipleScreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Screen3Controller implements BaseController {

    private ScreensController screensController;

    @Override
    public void setParent(ScreensController screensController) {
        this.screensController = screensController;
    }

    @FXML
    public void event1(ActionEvent event) {
        screensController.setScreen(ScreensFramework.screen1ID);
    }

    public void event2(ActionEvent event) {
        screensController.setScreen(ScreensFramework.screen2ID);
    }
}
