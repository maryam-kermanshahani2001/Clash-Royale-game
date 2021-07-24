package sample.model.playersPack;

import sample.model.MapComponent;
import sample.model.elements.BuildingCards.Cannon;
import sample.model.elements.BuildingCards.InfernoTower;
import sample.model.elements.Card;
import sample.model.elements.SpellCards.Arrow;
import sample.model.elements.SpellCards.Fireball;
import sample.model.elements.SpellCards.Rage;
import sample.model.elements.TroopCards.*;
import sample.model.gameLogic.GameState;
import sample.model.mapComponents.Ground;
import sample.model.mapComponents.KingTower;
import sample.model.mapComponents.QueenTower;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Random;

/**
 * The type Bot player.
 */
public class BotPlayer {

    private String name;
    private Random randomInt;
    private ArrayList<Card> cards;
    private ArrayList<QueenTower> queenTowers;
    private KingTower kingTower;
    private ArrayList<Ground> ground; //? array or just a ground
    private GameState gameState;
    private int teamNum;
    /**
     * Instantiates a new Bot player.
     */
    public BotPlayer() {
        name = "bot";
        cards = new ArrayList<>();
        queenTowers = new ArrayList<>();
        kingTower = new KingTower();
        QueenTower queenTower1 = new QueenTower();
        QueenTower queenTower2 = new QueenTower();
        queenTowers.add(queenTower1);
        queenTowers.add(queenTower2);
        gameState = GameState.getInstance();
        teamNum = 2;
    }


    /**
     * Produce random card.
     */
    public void produceRandomCard() {
        for (int i = 0; i < 8; i++) {
            int randNum = randomInt.nextInt(12);
            if (randNum == 0) {
                Cannon cannon = new Cannon();
                cards.add(cannon);
            } else if (randNum == 1) {
                InfernoTower inferno = new InfernoTower();
                cards.add(inferno);
            } else if (randNum == 2) {
                Arrow arrow = new Arrow();
                cards.add(arrow);
            } else if (randNum == 3) {
                Fireball fireball = new Fireball();
                cards.add(fireball);
            } else if (randNum == 4) {
                Rage rage = new Rage();
                cards.add(rage);
            } else if (randNum == 5) {
                Archer archer = new Archer();
                cards.add(archer);
            } else if (randNum == 6) {
                BabyDragon babyDragon = new BabyDragon();
                cards.add(babyDragon);
            } else if (randNum == 7) {
                Barbarian barbarian = new Barbarian();
                cards.add(barbarian);
            } else if (randNum == 8) {
                Giant giant = new Giant();
                cards.add(giant);
            } else if (randNum == 9) {
                MiniPekka miniPekka = new MiniPekka();
                cards.add(miniPekka);
            } else if (randNum == 10) {
                Valkyrie valkyrie = new Valkyrie();
                cards.add(valkyrie);
            } else if (randNum == 11) {
                Wizard wizard = new Wizard();
                cards.add(wizard);
            }

        }

    }

    /**
     * Choose random card .
     *
     * @return the card
     */
    private Card chooseRandCard() {
        int randNum = randomInt.nextInt(8);
        return cards.get(randNum);
    }

    public void placeACardOnMap() {
        Card card = chooseRandCard();
        gameState.getMap().addMapComponent(3, 29, card);
    }
/*

    public void setComponentOnMap(MapComponent mapComponent) {

       mapComponent
    }*/
}
