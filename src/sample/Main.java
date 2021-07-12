package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.model.gameLogic.GameStarter;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/GamePages/Signup.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 429, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        GameStarter gameStarter = new GameStarter();
        launch(args);
    }
}
