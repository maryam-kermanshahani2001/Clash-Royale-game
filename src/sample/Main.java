package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.model.gameLogic.GameStarter;

/**
 * The type Main.
 */
public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/GamePages/Signup.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 475, 481));
        primaryStage.show();
    }


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        GameStarter gameStarter = new GameStarter();
        launch(args);
    }
}
