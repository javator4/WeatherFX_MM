package pl.sda.weather;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

public class App extends Application {

    private static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("uruchomienie aplikacji");
        logger.warn("warning");
        logger.debug("debug");
        logger.error("error");

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/root.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Weather service SDA");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
