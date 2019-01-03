package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage stage = null;
    StackPane root = new StackPane();
    private JFXButton btn1;
    private JFXButton btn2;
    private JFXButton btn3;

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.stage = primaryStage;
        btn1 = new JFXButton("JFXDialog");
        btn2 = new JFXButton("Notifications");
        btn3 = new JFXButton("Go View1");

        root.getChildren().addAll(btn1, btn2, btn3);
        root.setPadding(new Insets(20));
        root.setAlignment(btn1, Pos.BOTTOM_CENTER);
        root.setAlignment(btn2, Pos.BOTTOM_RIGHT);
        root.setAlignment(btn3, Pos.BOTTOM_LEFT);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        initView();
    }

    private void initView() {
        btn1.setOnAction( me -> {
            System.out.println("btn1.......");
            JFXDialogLayout dialogLayout = new JFXDialogLayout();
            JFXDialog jfxDialog = null;
            dialogLayout.setHeading(new Text("setHeading"));
            dialogLayout.setActions(new JFXButton("Ok"));
            dialogLayout.setBody(new StackPane(new ImageView(new Image("https://www.baidu.com/img/bd_logo1.png"))));
            jfxDialog = new JFXDialog(root, dialogLayout, JFXDialog.DialogTransition.CENTER);
            jfxDialog.autosize();
            jfxDialog.show();
        });

        btn2.setOnAction( me -> {
            System.out.println("btn2.......");
            Notifications ntf = Notifications.create().title("title").text("text")
                    .hideAfter(Duration.seconds(3)).position(Pos.BOTTOM_CENTER);
            ntf.showInformation();
        });

        btn3.setOnAction(me -> {
            try {
                System.out.println(System.getProperty("user.dir"));
                URL resource = getClass().getResource("fxml/sample.fxml");
                URL resource2 = ClassLoader.getSystemResource("fxml/sample.fxml");
                System.out.println(resource2);
                FXMLLoader loader = new FXMLLoader(resource2);
                TilePane tilePane = loader.load();

                Stage stage1 = new Stage();
                stage1.setScene(new Scene(tilePane));
                stage1.show();

                Controller view1 = loader.getController();
                view1.say();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
