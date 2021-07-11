package sample.model.gameLogic;

import sample.model.User;

import java.util.ArrayList;

public class GameState {
    private static GameState instance;

    private ArrayList<User> users;



    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }
}
