package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.model.gameLogic.GameState;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * The type Profile con.
 */
public class ProfileCon implements Initializable {
    @FXML
    private Label levelLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Label leagueLabel;

    @FXML
    private Label cupNumLabel;

    @FXML
    private Button mainMenuBtn;

    /**
     * The Game state.
     */
    GameState gameState = GameState.getInstance();

    /**
     * Action handler.
     *
     * @param event the event
     * @throws IOException the io exception
     */
    @FXML
    void actionHandler(ActionEvent event) throws IOException {

        if (event.getSource() == mainMenuBtn) {

            URL url = new URL("file:/D:\\Classes\\Ap_main_class\\Ap-FinalProject\\src\\sample\\view\\GamePages\\Menu.fxml");
            updatePage(url);

        }
    }

    /**
     * Update page.
     *
     * @param url the url
     * @throws IOException the io exception
     */
    public void updatePage(URL url) throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) mainMenuBtn.getScene().getWindow();
//            System.out.println(getClass().getResource(".."));
        root = FXMLLoader.load(url);
//            root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        leagueLabel.setText(gameState.getCurrPlayer().getLeague() + "");
        nameLabel.setText(gameState.getCurrPlayer().getUsername() + "");
        cupNumLabel.setText(gameState.getCurrPlayer().getWinNumber() + "");
        levelLabel.setText(gameState.getCurrPlayer().getLevel() + "");


    }
}
