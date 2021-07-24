package sample.model.gameLogic;

import sample.model.MapComponent;
import sample.model.mapComponents.Map;
import sample.model.playersPack.BotPlayer;
import sample.model.playersPack.Player;

import java.util.ArrayList;

/**
 * The type Game state.
 */
public class GameState {
    private Player currPlayer;
    private BotPlayer bot;
    private static GameState instance;
    private boolean isGameStarted;
    /**
     * The constant CELL_WIDTH.
     */
    public final static double CELL_WIDTH = 35.0;

    private int rowCount;
    private int ColCount;

//    private ArrayList<>
    private ArrayList<MapComponent> mapComponents;
    private Map map;
    private boolean isGameOver;

    private GameState() {
        isGameOver = false;
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    /**
     * Sets curr player.
     *
     * @param player the player
     */
    public void setCurrPlayer(Player player) {
        currPlayer = player;
    }

    /**
     * Gets curr player.
     *
     * @return the curr player
     */
    public Player getCurrPlayer() {
        return currPlayer;
    }

    /**
     * Gets map.
     *
     * @return the map
     */
    public Map getMap() {
        return map;
    }

    /**
     * Construct map.
     */
    public void constructMap() {
        map = new Map();
    }

    /**
     * Sets map.
     *
     * @param map the map
     */
    public void setMap(Map map) {
        this.map = map;
    }

    /**
     * Is game over boolean.
     *
     * @return the boolean
     */
    public boolean isGameOver() {
        return isGameOver;
    }

    /**
     * Sets game over.
     *
     * @param gameOver the game over
     */
    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public BotPlayer getBot() {
        return bot;
    }

    public void setBot(BotPlayer bot) {
        this.bot = bot;
    }
}
