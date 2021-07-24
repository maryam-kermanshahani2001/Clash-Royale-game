package sample.controller;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import sample.model.elements.BuildingCards.Cannon;
import sample.model.elements.BuildingCards.InfernoTower;
import sample.model.elements.Card;
import sample.model.elements.SpellCards.Arrow;
import sample.model.elements.SpellCards.Fireball;
import sample.model.elements.SpellCards.Rage;
import sample.model.elements.TroopCards.*;
import sample.model.gameLogic.GameManager;
import sample.model.mapComponents.Map;
import sample.view.MapView;

//import java.awt.*;
import java.net.URL;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Timer;

/**
 * The type Game con.
 */
public class GameCon implements EventHandler<MouseEvent>, Initializable {
    final private static double FRAMES_PER_SECOND = 5.0;
    @FXML
    private MapView gameView;

    private ImageView[][] cellViewsMapView;
    @FXML
    private Label playerCrownsLabel;

    @FXML
    private Label timeLabel;

    @FXML
    private Label oppCrownsLabel;

    @FXML
    private ImageView card1;

    @FXML
    private ImageView nextCard;

    @FXML
    private ImageView card4;

    @FXML
    private ImageView card3;

    @FXML
    private ImageView card2;

    @FXML
    private ProgressBar elixirProgressBar;

    @FXML
    private AnchorPane mapPane;

    @FXML
    private Label elixirLabel;
    @FXML
    private AnchorPane cardWalletPane;

    private Timer timer;
    private Map map;
    private GameManager gameManager;
    private Timeline gameLoopTimer, elixirTimer, gameRefreshViewTimer;
    private ImageView selectedCard;
    private HashMap<Card, ImageView> cardImageViewHashMap;

    private Image cannonCardImg;
    private Image infernoTowerCardImg;
    private Image arrowCardImg;
    private Image rageCardImg;
    private Image fireBallCardImg;
    private Image archerCardImg;
    private Image barbarianCardImg;
    private Image dragonCardImg;
    private Image giantCardImg;
    private Image miniCardImg;
    private Image valkyrieCardImg;
    private Image wizardCardImg;

    /**
     * Instantiates a new Game con.
     */
    public GameCon() {
        gameManager = new GameManager();
        cardImageViewHashMap = new HashMap<>();
        loadImages();
//        card1.setImage(new Image(getClass().getResourceAsStream("./src/sample/view/Pics/Spell/arrow.png")));
//      /*  card2.setImage(new Image("/sample/view/Pics/Troop/archer.PNG"));
//        card4.setImage(new Image("/sample/view/Pics/Building/Cannon.PNG"));
        // TODO gamemanager ro bede b gameloop

    }

    /**
     * Load images.
     */
    public void loadImages() {

        // load card Images
        this.cannonCardImg = new Image(Paths.get("./src/sample/view/Pics/Building/Cannon.PNG").toUri().toString());
        this.barbarianCardImg = new Image(Paths.get("./src/sample/view/Pics/Troop/Barbarian.PNG").toUri().toString());
        this.archerCardImg = new Image(Paths.get("./src/sample/view/Pics/Troop/archer.PNG").toUri().toString());
        this.giantCardImg = new Image(Paths.get("./src/sample/view/Pics/Troop/Giant.PNG").toUri().toString());
        this.rageCardImg = new Image(Paths.get("./src/sample/view/Pics/Spell/rage.PNG").toUri().toString());
        this.arrowCardImg = new Image(Paths.get("./src/sample/view/Pics/Spell/arrow.PNG").toUri().toString());
        this.fireBallCardImg = new Image(Paths.get("./src/sample/view/Pics/Spell/fireball.PNG").toUri().toString());
        this.dragonCardImg = new Image(Paths.get("./src/sample/view/Pics/Troop/dragon.PNG").toUri().toString());
        this.miniCardImg = new Image(Paths.get("./src/sample/view/Pics/Troop/mini.PNG").toUri().toString());
        this.valkyrieCardImg = new Image(Paths.get("./src/sample/view/Pics/Troop/valkyrie.PNG").toUri().toString());
        this.wizardCardImg = new Image(Paths.get("./src/sample/view/Pics/Troop/wizard.PNG").toUri().toString());
        this.infernoTowerCardImg = new Image(Paths.get("./src/sample/view/Pics/Building/inferno.PNG").toUri().toString());


    }


    private void gameLoop() {
        long frameTimeInMilliseconds = (long) (1000.0 / FRAMES_PER_SECOND);

        if (gameManager.getGameState().isGameOver())
            gameLoopTimer.stop();
        else {
            this.gameLoopTimer = new Timeline(new KeyFrame(Duration.seconds(1), event -> updateModelAndView()));
            gameLoopTimer.setCycleCount(180);
            gameLoopTimer.play();
        }
    }

    /**
     * Update model and view.
     */
    public void updateModelAndView() {
        gameManager.update();
        gameView.update(gameManager.getGameState().getMap());
    }

    /**
     * Card hashmap init.
     */
    public void cardHashmapInit() {
        cardImageViewHashMap.put(gameManager.getGameState().getCurrPlayer().getCards().get(0), card1);
        cardImageViewHashMap.put(gameManager.getGameState().getCurrPlayer().getCards().get(1), card2);
        cardImageViewHashMap.put(gameManager.getGameState().getCurrPlayer().getCards().get(2), card3);
        cardImageViewHashMap.put(gameManager.getGameState().getCurrPlayer().getCards().get(3), card4);

    }

    /**
     * Mouse clicked init.
     */
    public void mouseClickedInit() {
        mapPane.setOnMouseClicked(this::handleMouseClickOnPane);
        card1.setOnMouseClicked(this::handleMouseClickOnCards);
        card2.setOnMouseClicked(this::handleMouseClickOnCards);
        card3.setOnMouseClicked(this::handleMouseClickOnCards);
        card4.setOnMouseClicked(this::handleMouseClickOnCards);

    }

    /**
     * Sets image view on card wallet.
     */
    public void setImageViewOnCardWallet() {

        for (int i = 0; i < 4; i++) {
            Card playerCard = gameManager.getGameState().getCurrPlayer().getCards().get(i);
            if (playerCard instanceof Arrow) {

//                card2.setImage(new Image(Paths.get("./src/sample/view/Pics/Spell/arrow.PNG").toUri().toString()));
                cardImageViewHashMap.get(playerCard).setImage(arrowCardImg);
            } else if (playerCard instanceof Barbarian) {
                cardImageViewHashMap.get(playerCard).setImage(barbarianCardImg);
            } else if (playerCard instanceof Archer) {
                cardImageViewHashMap.get(playerCard).setImage(archerCardImg);

            } else if (playerCard instanceof Giant) {
                cardImageViewHashMap.get(playerCard).setImage(giantCardImg);
            } else if (playerCard instanceof Cannon) {
                cardImageViewHashMap.get(playerCard).setImage(cannonCardImg);

            } else if (playerCard instanceof Rage) {
                cardImageViewHashMap.get(playerCard).setImage(rageCardImg);

            } else if (playerCard instanceof Fireball) {
                cardImageViewHashMap.get(playerCard).setImage(fireBallCardImg);

            } else if (playerCard instanceof InfernoTower) {
                cardImageViewHashMap.get(playerCard).setImage(infernoTowerCardImg);

            } else if (playerCard instanceof BabyDragon) {
                cardImageViewHashMap.get(playerCard).setImage(dragonCardImg);

            } else if (playerCard instanceof MiniPekka) {
                cardImageViewHashMap.get(playerCard).setImage(miniCardImg);

            } else if (playerCard instanceof Valkyrie) {
                cardImageViewHashMap.get(playerCard).setImage(valkyrieCardImg);

            } else if (playerCard instanceof Wizard) {
                cardImageViewHashMap.get(playerCard).setImage(wizardCardImg);

            }

            // TODO for all cards should set these
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cardHashmapInit();
        setImageViewOnCardWallet();
        mouseClickedInit();
        gameLoop();


    }

    private void handleMouseClickOnCards(MouseEvent mouseEvent) {
        selectedCard = (ImageView) mouseEvent.getSource();

    }

    @Override
    public void handle(MouseEvent mouseEvent) {
      /*  ImageView source = (ImageView) mouseEvent.getSource();
        if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_CLICKED)) {
            source.setImage(nextCard.getImage());
        }*/
       /* selectedCard = (ImageView) mouseEvent.getSource();
        double x = selectedCard.getX();
        double y = selectedCard.getY();*/

        //        mouseEvent.getSource()
    }


    /**
     * Handle mouse click on pane.
     *
     * @param mouseEvent the mouse event
     */
    public void handleMouseClickOnPane(MouseEvent mouseEvent) {
        if (selectedCard != null) {
            double x = mouseEvent.getX();
            double y = mouseEvent.getY();
            int xIndex = (int) (x / 35);
            int yIndex = (int) (y / 35);
            Card card = findCard();
            if (card != null)
                gameManager.addCharacterOnCell(xIndex, yIndex, card);
            // TODO find what character should be new and then make the selected card null
            selectedCard = null;
        }


        //        ImageView imv = (ImageView) mouseEvent.getSource();
        //        imv.setImage(new Image(Paths.get("./src/sample/view/Pics/Troop/Barbarian.PNG").toUri().toString()));
    }

    private Card findCard() {
        Card card;
        for (Card c : cardImageViewHashMap.keySet()) {
            if (cardImageViewHashMap.get(c) == selectedCard) {
                return c;
            }
        }
        return null;
    }

}
