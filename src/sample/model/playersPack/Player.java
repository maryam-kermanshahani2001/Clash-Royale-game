package sample.model.playersPack;

import sample.model.elements.Card;
import sample.model.mapComponents.Ground;
import sample.model.mapComponents.KingTower;
import sample.model.mapComponents.QueenTower;

import java.io.Serializable;
import java.util.*;

/**
 * The type Player.
 */
public class Player implements Serializable {
    private String username;
    private String password;
    private ArrayList<Card> cards;
    private KingTower kingTower;
    private ArrayList<QueenTower> queenTowers;
    private ArrayList<Ground> ground;
    private int teamNum;
    private Set cardSet;
    private int elixir;
    private int winNumber;
    private int level;
    private String league;
    private boolean isCardWalletSet;

    /**
     * Instantiates a new Player.
     *
     * @param username the username
     * @param password the password
     */
    public Player(String username, String password) {
        this.username = username;
        this.password = password;
        this.cards = new ArrayList<>();
        this.cardSet = new HashSet();
        this.elixir = 4;
        this.level = 1;
        this.winNumber = 0;
        this.league = "default";
        queenTowers = new ArrayList<>();
        kingTower = new KingTower();
        QueenTower queenTower1 = new QueenTower();
        QueenTower queenTower2 = new QueenTower();
        queenTowers.add(queenTower1);
        queenTowers.add(queenTower2);
        isCardWalletSet = false;
        teamNum = 1;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
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

    /**
     * Add card.
     *
     * @param card the card
     */
    public void addCard(Card card) {
        cards.add(card);
    }

    /**
     * Gets cards.
     *
     * @return the cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * Add to card set.
     *
     * @param card the card
     */
    public void addToCardSet(Card card) {
        cardSet.add(card);
    }

    /**
     * Gets elixir.
     *
     * @return the elixir
     */
    public int getElixir() {
        return elixir;
    }

    /**
     * Gets win number.
     *
     * @return the win number
     */
    public int getWinNumber() {
        return winNumber;
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets cards.
     *
     * @param cards the cards
     */
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    /**
     * Sets elixir.
     *
     * @param elixir the elixir
     */
    public void setElixir(int elixir) {
        this.elixir = elixir;
    }

    /**
     * Sets win number.
     *
     * @param winNumber the win number
     */
    public void setWinNumber(int winNumber) {
        this.winNumber = winNumber;
    }

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Gets league.
     *
     * @return the league
     */
    public String getLeague() {
        return league;
    }

    /**
     * Sets league.
     *
     * @param league the league
     */
    public void setLeague(String league) {
        this.league = league;
    }

    /**
     * Remove card.
     *
     * @param card the card
     */
    public void removeCard(Card card) {
        cards.remove(card);
    }

    /**
     * Remove all card.
     */
    public void removeAllCard() {
        Iterator<Card> it = cards.iterator();
        while (it.hasNext()){
            Card c = it.next();
            it.remove();
        }
        isCardWalletSet = false;

    }

    /**
     * Is card wallet set boolean.
     *
     * @return the boolean
     */
    public boolean isCardWalletSet() {
        return isCardWalletSet;
    }

    /**
     * Sets card wallet set.
     *
     * @param cardWalletSet the card wallet set
     */
    public void setCardWalletSet(boolean cardWalletSet) {
        isCardWalletSet = cardWalletSet;
    }
}
