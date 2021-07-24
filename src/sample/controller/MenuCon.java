package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.model.elements.BuildingCards.Cannon;
import sample.model.elements.BuildingCards.InfernoTower;
import sample.model.elements.SpellCards.Arrow;
import sample.model.elements.SpellCards.Rage;
import sample.model.elements.TroopCards.Archer;
import sample.model.elements.TroopCards.BabyDragon;
import sample.model.elements.TroopCards.Barbarian;
import sample.model.elements.TroopCards.Giant;
import sample.model.gameLogic.GameState;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The type Menu con.
 */
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
        if (event.getSource() == trainingBtn) {
//            URL url = new URL("file:/D:\\Classes\\Ap_main_class\\FinalProject\\src\\sample\\view\\GamePages\\GameMap.fxml");
            if (gameState.getCurrPlayer().isCardWalletSet()) {
                URL url = new URL("file:/D:\\Classes\\Ap_main_class\\Ap-FinalProject\\src\\sample\\view\\GamePages\\rightMap2.fxml");
                updatePage(url);
            } else {
                //TODO set a label that player have to set his/her cards
                System.out.println("you don't set your cards.continue by game default settings?");
                gameState.getCurrPlayer().addCard(new Archer());
                gameState.getCurrPlayer().addCard(new Giant());
                gameState.getCurrPlayer().addCard(new Rage());
                gameState.getCurrPlayer().addCard(new Arrow());
                gameState.getCurrPlayer().addCard(new Cannon());
                gameState.getCurrPlayer().addCard(new BabyDragon());
                gameState.getCurrPlayer().addCard(new Barbarian());
                gameState.getCurrPlayer().addCard(new InfernoTower());
                gameState.getCurrPlayer().setCardWalletSet(true);
                URL url = new URL("file:/D:\\Classes\\Ap_main_class\\Ap-FinalProject\\src\\sample\\view\\GamePages\\rightMap2.fxml");
                updatePage(url);

            }

        } else if (event.getSource() == battleDeckBtn) {
/*
            URL url = new URL("file:/D:\\Classes\\Ap_main_class\\Ap-FinalProject\\src\\sample\\view\\GamePages\\BattleDeck.fxml");
            updatePage(url);
*/
            Stage stage;
            Parent root;

            stage = (Stage) battleDeckBtn.getScene().getWindow();
//            System.out.println(getClass().getResource(".."));
//            root = FXMLLoader.load(getClass().getResource("/sample/view/GamePages/BattleDeck.fxml"));
//            root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
            root = FXMLLoader.load(Paths.get("./src/sample/view/GamePages/BattleDeck.fxml").toUri().toURL());

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if (event.getSource() == profileBtn) {

            URL url = new URL("file:/D:\\Classes\\Ap_main_class\\Ap-FinalProject\\src\\sample\\view\\GamePages\\Profile.fxml");
            updatePage(url);
        } else if (event.getSource() == historyBtn) {

        } else if (event.getSource() == quitBtn) {

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

        stage = (Stage) battleDeckBtn.getScene().getWindow();
//            System.out.println(getClass().getResource(".."));
        root = FXMLLoader.load(url);
//            root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}
