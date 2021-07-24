package sample;

import sample.model.gameLogic.GameState;
import sample.model.playersPack.Player;

import java.util.ArrayList;
import java.util.Date;

/**
 * The type Datas.
 */
public class Datas {

    private static Datas instance;

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static Datas getInstance() {
        if (instance == null) {
            instance = new Datas();
        }
        return instance;
    }
    private ArrayList<Player> players = new ArrayList<>();

    /**
     * Gets users.
     *
     * @return the users
     */
    public ArrayList<Player> getUsers() {
        return players;
    }

//    public void constructUsers() {
//        players = new ArrayList<>();
//    }
}
