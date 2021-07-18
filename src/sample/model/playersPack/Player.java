package sample.model.playersPack;

import sample.model.elements.Card;
import sample.model.mapComponents.Ground;
import sample.model.mapComponents.KingTower;
import sample.model.mapComponents.QueenTower;

import java.io.Serializable;
import java.util.*;

public class Player implements Serializable {
    private String username;
    private String password;
    private ArrayList<Card> cards;
    private KingTower kingTower;
    private ArrayList<QueenTower> queenTowers;
    private ArrayList<Ground> ground;
    private String team;
    private Set cardSet;
    private int elixir;
    private int winNumber;
    private int level;
    private String league;

    public Player(String username, String password) {
        this.username = username;
        this.password = password;
        this.cards = new ArrayList<>();
        this.cardSet = new HashSet();
        this.elixir = 4;
        this.level = 1;
        this.winNumber = 0;
        this.league = "default";
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        boolean res1 = Objects.equals(getPassword(), player.getPassword());
        boolean res2 = Objects.equals(getUsername(), player.getUsername());
        return (res1) && (res2);
    }

    @Override
    public String toString() {
        return "username: " + username + "|" + "password: " + password;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addToCardSet(Card card) {
        cardSet.add(card);
    }

    public int getElixir() {
        return elixir;
    }

    public int getWinNumber() {
        return winNumber;
    }

    public int getLevel() {
        return level;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void setElixir(int elixir) {
        this.elixir = elixir;
    }

    public void setWinNumber(int winNumber) {
        this.winNumber = winNumber;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public void removeAllCard() {
        Iterator<Card> it = cards.iterator();
        while (it.hasNext()){
            Card c = it.next();
            it.remove();
        }
    }
}
