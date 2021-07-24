package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Datas;
import sample.model.FileUtils.Loader;
import sample.model.playersPack.Player;
import sample.model.gameLogic.GameState;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

/**
 * The type Login con.
 */
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

    @FXML
    private Label warningLabel;

    private GameState gameState = GameState.getInstance();

    private Datas datas = Datas.getInstance();

    private HashMap<String, Player> loadedPlayers;

    /**
     * Action handler.
     *
     * @param event the event
     * @throws IOException the io exception
     */
    @FXML
    void actionHandler(ActionEvent event) throws IOException {
        if (event.getSource() == loginBtn) {
//            Player player = findUser();
            Player player = findUserFile();

            if (player != null) {
                gameState.setCurrPlayer(player);
                player.removeAllCard();
                URL url = new URL("file:/D:\\Classes\\Ap_main_class\\Ap-FinalProject\\src\\sample\\view\\GamePages\\Menu.fxml");
                updatePage(url);
            }

        } else if (event.getSource() == rememberBox) {

        } else if (event.getSource() == forgotLink) {

        } else {
            System.out.println("------------------");
        }
    }

    /**
     * Find user player.
     *
     * @return the player
     */
    public Player findUser() {
        for (Player u : datas.getUsers()) {
            if (u.getUsername().equals(userField.getText())) {
                if (u.getPassword().equals(passField.getText())) {
                    System.out.println("Logged in");
                    return u;
                } else {
                    warningLabel.setText("password incorrect");

//                    System.out.println("password incorrect");
                    return null;
                }
            }
        }
        warningLabel.setText("This user doesn't exist");

//        System.out.println("This user doesn't exist");
        return null;


    }

    /**
     * Find user file player.
     *
     * @return the player
     */
    public Player findUserFile() {

        Loader loader = new Loader("Files");
        try {
            loadedPlayers = loader.loadSavedPlayers();

            for (String playerName : loadedPlayers.keySet()) {
                if (playerName.equals(userField.getText())) {
                    if (loadedPlayers.get(playerName).getPassword().equals(passField.getText())) {
                        System.out.println("logged in");
                        gameState.setCurrPlayer(loadedPlayers.get(playerName));
                        loader.loadObject("./src/sample/Files/" + gameState.getCurrPlayer().getUsername());
                        System.out.println(gameState.getCurrPlayer().getUsername());
                        return gameState.getCurrPlayer();
                    } else {
                        warningLabel.setText("password incorrect");

//                    System.out.println("password incorrect");
                        return null;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        warningLabel.setText("This user doesn't exist");
        return null;
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

        stage = (Stage) loginBtn.getScene().getWindow();
//            System.out.println(getClass().getResource(".."));
        root = FXMLLoader.load(url);
//            root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
