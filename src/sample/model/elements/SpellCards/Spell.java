package sample.model.elements.SpellCards;

import sample.model.elements.Card;

public class Spell extends Card {
    // ability ?
    private double radius; // radius
    private int level;

    public Spell(int cost, double radius, String name) {
        super(cost, name);
        this.radius = radius;
        this.level = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
