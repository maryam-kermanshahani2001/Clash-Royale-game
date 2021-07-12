package sample.model.playersPack;

import sample.model.elements.Card;

import java.util.ArrayList;
import java.util.Objects;

public class Player {
    private String username;
    private String password;
    private ArrayList<Card> cards;

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
        this.cards =new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        boolean res1 = Objects.equals (getPassword (), player.getPassword ());
        boolean res2 = Objects.equals (getUsername (), player.getUsername ());
        return (res1) && (res2);
    }

    @Override
    public String toString() {
        return "username: " + username + "|" + "password: " + password;
    }

    public void addCard(Card card) {
        cards.add(card);
    }
}
