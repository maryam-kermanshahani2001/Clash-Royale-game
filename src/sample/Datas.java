package sample;

import sample.model.gameLogic.GameState;
import sample.model.playersPack.Player;

import java.util.ArrayList;
import java.util.Date;

public class Datas {

    private static Datas instance;

    public static Datas getInstance() {
        if (instance == null) {
            instance = new Datas();
        }
        return instance;
    }
    private ArrayList<Player> players = new ArrayList<>();

    public ArrayList<Player> getUsers() {
        return players;
    }

//    public void constructUsers() {
//        players = new ArrayList<>();
//    }
}
