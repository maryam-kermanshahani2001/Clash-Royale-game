package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.model.gameLogic.GameState;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MenuCon {

    @FXML
    private Button historyBtn;

    @FXML
    private Button battleDeckBtn;

    @FXML
    private Button profileBtn;

    @FXML
    private Button trainingBtn;

    @FXML
    private Button quitBtn;

    GameState gameState = GameState.getInstance();

    @FXML
    void actionHandler(ActionEvent event) throws IOException {
        if (event.getSource() == trainingBtn) {
//            URL url = new URL("file:/D:\\Classes\\Ap_main_class\\FinalProject\\src\\sample\\view\\GamePages\\GameMap.fxml");
            URL url = new URL("file:/D:\\Classes\\Ap_main_class\\FinalProject\\src\\sample\\view\\GamePages\\rightMap.fxml");

            updatePage(url);
        } else if (event.getSource() == battleDeckBtn) {
            URL url = new URL("file:/D:\\Classes\\Ap_main_class\\FinalProject\\src\\sample\\view\\GamePages\\BattleDeck.fxml");
            updatePage(url);
        } else if (event.getSource() == profileBtn) {

            URL url = new URL("file:/D:\\Classes\\Ap_main_class\\FinalProject\\src\\sample\\view\\GamePages\\Profile.fxml");
            updatePage(url);
        } else if (event.getSource() == historyBtn) {

        } else if (event.getSource() == quitBtn) {

        }


    }

    public void updatePage(URL url) throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) battleDeckBtn.getScene().getWindow();
//            System.out.println(getClass().getResource(".."));
        root = FXMLLoader.load(url);
//            root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}
