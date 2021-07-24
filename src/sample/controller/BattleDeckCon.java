package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import sample.model.elements.BuildingCards.Cannon;
import sample.model.elements.BuildingCards.InfernoTower;
import sample.model.elements.Card;
import sample.model.elements.SpellCards.Arrow;
import sample.model.elements.SpellCards.Fireball;
import sample.model.elements.SpellCards.Rage;
import sample.model.elements.TroopCards.*;
import sample.model.gameLogic.GameState;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * The type Battle deck con.
 */
public class BattleDeckCon implements Initializable {


    @FXML
    private HBox allCardsBox1;

    @FXML
    private HBox allCardsBox2;

    @FXML
    private ImageView Archer;

    @FXML
    private ImageView Barbarian;

    @FXML
    private ImageView Giant;

    @FXML
    private ImageView MiniPekka;

    @FXML
    private ImageView Valkyrie;

    @FXML
    private ImageView Wizard;

    @FXML
    private ImageView Arrow;

    @FXML
    private ImageView Fireball;

    @FXML
    private ImageView InfernoTower;

    @FXML
    private ImageView Rage;

    @FXML
    private ImageView BabyDragon;

    @FXML
    private ImageView Cannon;

    @FXML
    private Button mainMenuBtn;

    @FXML
    private GridPane playerGridPane;

    @FXML
    private HBox hbox;


    @FXML
    private HBox hbox2;

//    @FXML
//    private ImageView playerCard1;
//
//    @FXML
//    private ImageView playerCard2;
//
//    @FXML
//    private ImageView playerCard3;
//
//    @FXML
//    private ImageView playerCard4;
//
//    @FXML
//    private ImageView playerCard5;
//
//    @FXML
//    private ImageView playerCard6;
//
//    @FXML
//    private ImageView playerCard7;
//
//    @FXML
//    private ImageView playerCard8;


    private int emptyIndex = 0;

    private GameState gameState = GameState.getInstance();

    @FXML
    private Label cartNumLabel;

    @FXML
    private Button rstBtn;

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
        } else if (event.getSource() == rstBtn) {
            gameState.getCurrPlayer().removeAllCard();
            updatePage(new URL("file:/D:\\Classes\\Ap_main_class\\Ap-FinalProject\\src\\sample\\view\\GamePages\\BattleDeck.fxml"));

        }

    }


    /**
     * Handle mouse click.
     *
     * @param event the event
     * @throws IOException the io exception
     */
    @FXML
    void handleMouseClick(MouseEvent event) throws IOException {
        if (gameState.getCurrPlayer().getCards().size() < 8) {
            if (event.getSource() == Archer && !hasCard(Archer)) {
                gameState.getCurrPlayer().addCard(new Archer());
//                gameState.getCurrPlayer().addToCardSet(new Archer());
                if (emptyIndex < 4)
                    hbox.getChildren().add(Archer);
                else
                    hbox2.getChildren().add(Archer);


//                playerGridPane.getChildren().add(Archer);
//                GridPane.setConstraints(Archer, );
                emptyIndex++;
                cartNumLabel.setText(emptyIndex + "");

//            playerCard1.setImage(arrowView.getImage());
            } else if (event.getSource() == BabyDragon && !hasCard(BabyDragon)) {
                gameState.getCurrPlayer().addCard(new BabyDragon());
                if (emptyIndex < 4)
                    hbox.getChildren().add(BabyDragon);
                else
                    hbox2.getChildren().add(BabyDragon);

//                playerGridPane.getChildren().add(BabyDragon);
                emptyIndex++;
                cartNumLabel.setText(emptyIndex + "");

//            playerCard1.setImage(arrowView.getImage());
            } else if (event.getSource() == Barbarian && !hasCard(Barbarian)) {
                gameState.getCurrPlayer().addCard(new Barbarian());
//                playerGridPane.getChildren().add(Barbarian);
                if (emptyIndex < 4)
                    hbox.getChildren().add(Barbarian);
                else
                    hbox2.getChildren().add(Barbarian);
                emptyIndex++;
                cartNumLabel.setText(emptyIndex + "");

//            playerCard1.setImage(arrowView.getImage());
            } else if (event.getSource() == Giant && !hasCard(Giant)) {
                gameState.getCurrPlayer().addCard(new Giant());
                if (emptyIndex < 4)
                    hbox.getChildren().add(Giant);
                else
                    hbox2.getChildren().add(Giant);

//                playerGridPane.getChildren().add(Giant);
                emptyIndex++;
                cartNumLabel.setText(emptyIndex + "");

//            playerCard1.setImage(arrowView.getImage());
            } else if (event.getSource() == MiniPekka && !hasCard(MiniPekka)) {

                gameState.getCurrPlayer().addCard(new MiniPekka());
                if (emptyIndex < 4)
                    hbox.getChildren().add(MiniPekka);
                else
                    hbox2.getChildren().add(MiniPekka);
//                playerGridPane.getChildren().add(MiniPekka);
                emptyIndex++;
                cartNumLabel.setText(emptyIndex + "");

//            playerCard1.setImage(arrowView.getImage());
            } else if (event.getSource() == Valkyrie && !hasCard(Valkyrie)) {
                gameState.getCurrPlayer().addCard(new Valkyrie());
//                playerGridPane.getChildren().add(Valkyrie);
                if (emptyIndex < 4)
                    hbox.getChildren().add(Valkyrie);
                else
                    hbox2.getChildren().add(Valkyrie);
                emptyIndex++;
                cartNumLabel.setText(emptyIndex + "");

//            playerCard1.setImage(arrowView.getImage());
            } else if (event.getSource() == Wizard && !hasCard(Wizard)) {
                gameState.getCurrPlayer().addCard(new Wizard());
//                playerGridPane.getChildren().add(Wizard);
                if (emptyIndex < 4)
                    hbox.getChildren().add(Wizard);
                else
                    hbox2.getChildren().add(Wizard);

                emptyIndex++;
                cartNumLabel.setText(emptyIndex + "");

//            playerCard1.setImage(arrowView.getImage());
            } else if (event.getSource() == Arrow && !hasCard(Arrow)) {
                gameState.getCurrPlayer().addCard(new Arrow());
//                playerGridPane.getChildren().add(Arrow);
                if (emptyIndex < 4)
                    hbox.getChildren().add(Arrow);
                else
                    hbox2.getChildren().add(Arrow);
                emptyIndex++;
                cartNumLabel.setText(emptyIndex + "");

//            playerCard1.setImage(arrowView.getImage());
            } else if (event.getSource() == Fireball && !hasCard(Fireball)) {
                gameState.getCurrPlayer().addCard(new Fireball());
//                playerGridPane.getChildren().add(Fireball);
                if (emptyIndex < 4)
                    hbox.getChildren().add(Fireball);
                else
                    hbox2.getChildren().add(Fireball);
                emptyIndex++;
                cartNumLabel.setText(emptyIndex + "");

//            playerCard1.setImage(arrowView.getImage());
            } else if (event.getSource() == InfernoTower && !hasCard(InfernoTower)) {
                gameState.getCurrPlayer().addCard(new InfernoTower());
//                playerGridPane.getChildren().add(InfernoTower);
//                playerCard1.setImage(arrowView.getImage());
                if (emptyIndex < 4)
                    hbox.getChildren().add(InfernoTower);
                else
                    hbox2.getChildren().add(InfernoTower);
                emptyIndex++;
                cartNumLabel.setText(emptyIndex + "");

            } else if (event.getSource() == Rage && !hasCard(Rage)) {
                gameState.getCurrPlayer().addCard(new Rage());
//                playerGridPane.getChildren().add(Rage);
                if (emptyIndex < 4)
                    hbox.getChildren().add(Rage);
                else
                    hbox2.getChildren().add(Rage);

                emptyIndex++;
                cartNumLabel.setText(emptyIndex + "");

//            playerCard1.setImage(arrowView.getImage());
            } else if (event.getSource() == Cannon && !hasCard(Cannon)) {
                gameState.getCurrPlayer().addCard(new Cannon());
//                playerGridPane.getChildren().add(Cannon);
                if (emptyIndex < 4)
                    hbox.getChildren().add(Cannon);
                else
                    hbox2.getChildren().add(Cannon);

                emptyIndex++;
                cartNumLabel.setText(emptyIndex + "");

//            playerCard1.setImage(arrowView.getImage());
            }
        } else {
            cartNumLabel.setText("wallet full");
            gameState.getCurrPlayer().setCardWalletSet(true);
            cartNumLabel.setTextFill(Color.RED);
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

    /**
     * Has card boolean.
     *
     * @param img the img
     * @return the boolean
     */
    public boolean hasCard(ImageView img) {
        for (Card c : gameState.getCurrPlayer().getCards()) {
            if (c.getClass().getName().equals(img.getId())) {
                return true;
            }
        }
        return false;
    }

    //
//    private Node getNodeFromGridPane(GridPane gridPane, int col, int row) {
//        for (Node node : gridPane.getChildren()) {
//            if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row) {
//                return node;
//            }
//        }
//        return null;
//    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (Card c : gameState.getCurrPlayer().getCards()) {
            System.out.println(c.getClass().getName());

            if (c.getName().equals(Archer.getId())) {
                if (emptyIndex < 4)
                    hbox.getChildren().add(Archer);
                else
                    hbox2.getChildren().add(Archer);
                emptyIndex++;
            } else if (c.getName().equals(BabyDragon.getId())) {
                if (emptyIndex < 4)
                    hbox.getChildren().add(BabyDragon);
                else
                    hbox2.getChildren().add(BabyDragon);
                emptyIndex++;
            } else if (c.getName().equals(Barbarian.getId())) {
                if (emptyIndex < 4)
                    hbox.getChildren().add(Barbarian);
                else
                    hbox2.getChildren().add(Barbarian);
                emptyIndex++;
            } else if (c.getName().equals(Valkyrie.getId())) {
                if (emptyIndex < 4)
                    hbox.getChildren().add(Valkyrie);
                else
                    hbox2.getChildren().add(Valkyrie);
                emptyIndex++;
            } else if (c.getName().equals(Giant.getId())) {
                if (emptyIndex < 4)
                    hbox.getChildren().add(Giant);
                else
                    hbox2.getChildren().add(Giant);
                emptyIndex++;
            } else if (c.getName().equals(MiniPekka.getId())) {
                if (emptyIndex < 4)
                    hbox.getChildren().add(MiniPekka);
                else
                    hbox2.getChildren().add(MiniPekka);
                emptyIndex++;
            } else if (c.getName().equals(Wizard.getId())) {

                if (emptyIndex < 4)
                    hbox.getChildren().add(Wizard);
                else
                    hbox2.getChildren().add(Wizard);
                emptyIndex++;
            } else if (c.getName().equals(Arrow.getId())) {

                if (emptyIndex < 4)
                    hbox.getChildren().add(Arrow);
                else
                    hbox2.getChildren().add(Arrow);
                emptyIndex++;
            } else if (c.getName().equals(Fireball.getId())) {

                if (emptyIndex < 4)
                    hbox.getChildren().add(Fireball);
                else
                    hbox2.getChildren().add(Fireball);
                emptyIndex++;
            } else if (c.getName().equals(Cannon.getId())) {
                if (emptyIndex < 4)
                    hbox.getChildren().add(Cannon);
                else
                    hbox2.getChildren().add(Cannon);
                emptyIndex++;
            } else if (c.getName().equals(Rage.getId())) {
                if (emptyIndex < 4)
                    hbox.getChildren().add(Rage);
                else
                    hbox2.getChildren().add(Rage);
                emptyIndex++;
            } else if (c.getName().equals(InfernoTower.getId())) {
                if (emptyIndex < 4)
                    hbox.getChildren().add(InfernoTower);
                else
                    hbox2.getChildren().add(InfernoTower);
                emptyIndex++;
            }


        }
    }
/*
    @FXML
    void handleDragDetect(MouseEvent event) {
        if (event.getSource() == barbarianView) {
            Dragboard db = barbarianView.startDragAndDrop(TransferMode.MOVE);
            ClipboardContent clipboard = new ClipboardContent();
            clipboard.putImage(barbarianView.getImage());
            System.out.println(db.getContent(.ge));
            db.setContent(clipboard);
        } else if (event.getSource() == babyDragonView) {
            Dragboard db = babyDragonView.startDragAndDrop(TransferMode.MOVE);

        } else if (event.getSource() == archerView) {
            Dragboard db = archerView.startDragAndDrop(TransferMode.MOVE);

        } else if (event.getSource() == cannonView) {

        } else if (event.getSource() == infernoTowerView) {

        }
        event.consume();
    }

    @FXML
    void handleDragOver(DragEvent event) {
//        if (event.getDragboard().hasContent(DataFormat.IMAGE))
//        if (event.getDragboard().hasContent(DataFormat.IMAGE))
            event.acceptTransferModes(TransferMode.MOVE);

        event.consume();
    }

  */
/*  public void handleDragDetected(MouseEvent event) {
        Dragboard db = barbarianView.startDragAndDrop(TransferMode.MOVE);

    }*//*



    @FXML
    void handleDrop(DragEvent event) throws FileNotFoundException {
       */
/*Dragboard db = event.getDragboard();
       boolean success = false;
       if (db.hasFiles()) { {
           if (playerCard1.getImage() == null) {
               playerCard1.setImage(db.getDragView());
           }
       }

       }
        event.consume();*//*


        Image img = event.getDragboard().getImage();
        playerCard1.setImage(img);
        event.setDropCompleted(true);
//        event.consume();
    }
*/


}


// read from file
// while(!eof) {
// ois.readObj.getUsername ==
// ois.readobj()
// folder save with username files
// tak tak save knm ya arrayList bezarm
// drag and drop
// exception
// next step?
// bot?
///
// gameManager steps?
// update in that scene? -> search repaint
/*

 */
