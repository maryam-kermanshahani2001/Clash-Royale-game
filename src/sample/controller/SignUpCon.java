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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.IntFunction;

/**
 * The type Sign up con.
 */
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

    /**
     * The Game state.
     */
    GameState gameState = GameState.getInstance();
    private Datas datas = Datas.getInstance();

    /**
     * Action handler.
     *
     * @param event the event
     * @throws IOException the io exception
     */
    @FXML
    void actionHandler(ActionEvent event) throws IOException {
        if (event.getSource() == signUpBtn) {
            Player player = makeNewUser();
            if (userField.getText() != null) {
                if (!isExist(player)) {
                    addUser(player);
                    gameState.setCurrPlayer(player);
                    URL url = new URL("file:/D:\\Classes\\Ap_main_class\\Ap-FinalProject\\src\\sample\\view\\GamePages\\Menu.fxml");
                    updatePage(url);
                    System.out.println(player.getUsername() + " " + player.getPassword()); //for test
                    // new stage that is player panel
                } else {
                    warningLabel.setText("This username has already exist");
//                System.out.println("This username has already exist");
                }
            }


        } else if (event.getSource() == loginLink) {

            URL url = new URL("file:/D:\\Classes\\Ap_main_class\\Ap-FinalProject\\src\\sample\\view\\GamePages\\Login.fxml");
            updatePage(url);

        } else if (event.getSource() == rememberBox) {
            // ?

        } else {
            System.out.println("-------------------");
        }


    }

    /**
     * Make new user player.
     *
     * @return the player
     */
    public Player makeNewUser() {
        Player player = new Player(userField.getText(), passField.getText());
        return player;
    }


    /**
     * Is exist boolean.
     *
     * @param newPlayer the new player
     * @return the boolean
     */
    public boolean isExist(Player newPlayer) {

//        File dir = new File("D:\\Classes\\Ap_main_class\\Ap-FinalProject\\src\\sample\\Files");
        File dir = new File("./src/sample/Files");
        File[] directoryListing = dir.listFiles();
        if (directoryListing != null) {
            for (File child : directoryListing) {
                // Do something with child
                if (child.getName().equals(newPlayer.getUsername())) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * Add user.
     *
     * @param player the player
     */
    public void addUser(Player player) {
        datas.getUsers().add(player);
        try {
            saver.saveUser(player);
        } catch (IOException e) {
            e.printStackTrace();
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

        stage = (Stage) loginLink.getScene().getWindow();
//            System.out.println(getClass().getResource(".."));
        root = FXMLLoader.load(url);
//            root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
