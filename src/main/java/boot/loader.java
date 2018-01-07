package boot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class loader extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException{
        FXMLLoader loader=new FXMLLoader(getClass().getResource("/fxmls/app.fxml"));
        Parent root =loader.load();
//        controller.setStage(primaryStage);
        primaryStage.setTitle("welcome");
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/pixels/camera.png")));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
