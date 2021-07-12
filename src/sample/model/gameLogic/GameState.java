package sample.model.gameLogic;

import sample.model.playersPack.Player;

import java.util.ArrayList;

public class GameState {
    private static GameState instance;

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    private ArrayList<Player> players;

    public ArrayList<Player> getUsers() {
        return players;
    }

    public void constructUsers() {
        players = new ArrayList<>();
    }
}
