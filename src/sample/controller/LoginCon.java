package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.model.playersPack.Player;
import sample.model.gameLogic.GameState;

public class LoginCon {

    @FXML
    private Label loginLabel;

    @FXML
    private CheckBox rememberBox;

    @FXML
    private Hyperlink forgotLink;

    @FXML
    private Button loginBtn;

    @FXML
    private TextField userField;

    @FXML
    private TextField passField;

    private GameState gameState = GameState.getInstance();

    @FXML
    void actionHandler(ActionEvent event) {
        if (event.getSource() == loginBtn) {
            Player player = findUser();
            if (player != null) {
                // go to player panel
            }
            else {
                System.out.println("This player doesn't exist");
            }
        } else if (event.getSource() == rememberBox) {

        } else if (event.getSource() == forgotLink) {

        }
        else {
            System.out.println("------------------");
        }
    }

    public Player findUser() {
        for (Player u : gameState.getUsers()) {
            if (u.equals(new Player(userField.getText(), passField.getText())))
                return u;
        }
        return null;
    }
}
