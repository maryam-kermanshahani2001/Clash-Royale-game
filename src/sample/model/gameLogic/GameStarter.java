package sample.model.gameLogic;

import javafx.application.Application;
import sample.model.mapComponents.Map;

/**
 * The type Game starter.
 */
public class GameStarter {

    private Map map;
    private GameState gameState;

    /**
     * Instantiates a new Game starter.
     */
    public GameStarter() {
//        map = new Map();
        gameState = GameState.getInstance();
        gameInit();
    }

    /**
     * Game init.
     */
    public void gameInit() {

    }


}
