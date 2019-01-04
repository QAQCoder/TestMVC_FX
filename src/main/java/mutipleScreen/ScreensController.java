package mutipleScreen;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.util.HashMap;

public class ScreensController extends StackPane {

    private HashMap<String, Node> screens = new HashMap<>();

    public ScreensController() { super(); }

    public Node getScreens(String name) {
        return screens.get(name);
    }

    public void setScreens(String name, Node node) {
        this.screens.put(name, node);
    }

    public void loadScreen(String name, String resource) {
        try {
            FXMLLoader loader = new FXMLLoader(ClassLoader.getSystemResource(resource));
            Parent parent = loader.load();
            BaseController baseController = loader.getController();
            baseController.setParent(this);
            setScreens(name, parent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setScreen(String name) {
        if (screens.get(name) != null) {
            if (this.getChildren().size() > 0) {
                getChildren().remove(0);
                getChildren().add(0, screens.get(name));
            }
            else {
                getChildren().add(0, screens.get(name));
            }
        }
    }//
}
