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
import sample.model.FileUtils.Saver;
import sample.model.playersPack.Player;
import sample.model.gameLogic.GameState;

import java.io.IOException;
import java.net.URL;

public class SignUpCon {

    @FXML
    private Label signUpLabel;

    @FXML
    private CheckBox rememberBox;

    @FXML
    private Button signUpBtn;

    @FXML
    private TextField userField;

    @FXML
    private TextField passField;

    @FXML
    private Hyperlink loginLink;

    @FXML
    private Label warningLabel;

    private Saver saver = new Saver("Files");

    GameState gameState = GameState.getInstance();
    private Datas datas = Datas.getInstance();

    @FXML
    void actionHandler(ActionEvent event) throws IOException {
        if (event.getSource() == signUpBtn) {
            Player player = makeNewUser();

            if (!isExist(player)) {
                addUser(player);
                gameState.setCurrPlayer(player);
                URL url = new URL("file:/D:\\Classes\\Ap_main_class\\FinalProject\\src\\sample\\view\\GamePages\\Menu.fxml");
                updatePage(url);
                System.out.println(player.getUsername() + " " + player.getPassword()); //for test
                // new stage that is player panel
            } else {
                warningLabel.setText("This username has already exist");
//                System.out.println("This username has already exist");
            }

        } else if (event.getSource() == loginLink) {

            URL url = new URL("file:/D:\\Classes\\Ap_main_class\\FinalProject\\src\\sample\\view\\GamePages\\Login.fxml");
            updatePage(url);

        } else if (event.getSource() == rememberBox) {
            // ?

        } else {
            System.out.println("-------------------");
        }


    }

    public Player makeNewUser() {
        Player player = new Player(userField.getText(), passField.getText());
        return player;
    }


    public boolean isExist(Player newPlayer) {
        for (Player u : datas.getUsers()) {
            if (u.getUsername().equals(newPlayer.getUsername())) {

                return true;
            }
        }
        return false;
    }


    public void addUser(Player player) {
        datas.getUsers().add(player);
        try {
            saver.saveUser(player);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void updatePage(URL url) throws IOException {

        Stage stage;
        Parent root;

        stage = (Stage) loginLink.getScene().getWindow();
//            System.out.println(getClass().getResource(".."));
        root = FXMLLoader.load(url);
//            root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
