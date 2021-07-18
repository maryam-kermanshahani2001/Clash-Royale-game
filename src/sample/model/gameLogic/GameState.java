package sample.model.gameLogic;

import sample.model.MapComponent;
import sample.model.playersPack.Player;

import java.util.ArrayList;

public class GameState {
    private Player currPlayer;
    private static GameState instance;
//    private ArrayList<>
    private ArrayList<MapComponent> mapComponents;

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public void setCurrPlayer(Player player) {
        currPlayer = player;
    }

    public Player getCurrPlayer() {
        return currPlayer;
    }


}
