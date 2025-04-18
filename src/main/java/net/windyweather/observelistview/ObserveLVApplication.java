package net.windyweather.observelistview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ObserveLVApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ObserveLVApplication.class.getResource("OLV-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 400);
        stage.setTitle("Observe List View");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}