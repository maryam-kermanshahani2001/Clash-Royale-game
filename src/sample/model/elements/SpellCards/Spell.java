package sample.model.elements.SpellCards;

import sample.model.MapComponent;
import sample.model.elements.Card;

import java.util.ArrayList;
import java.util.Objects;

/**
 * The type Spell.
 */
public class Spell extends Card {
    // ability ?
    private double radius; // radius
    private int level;
    private ArrayList<MapComponent> enemies;

    /**
     * Instantiates a new Spell.
     *
     * @param cost   the cost
     * @param radius the radius
     * @param name   the name
     */
    public Spell(int cost, double radius, String name) {
        super(cost, name);
        this.radius = radius;
        this.level = 1;
        enemies = new ArrayList<>();
    }

    /**
     * Gets radius.
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets radius.
     *
     * @param radius the radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
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
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Spell spell = (Spell) o;
        return Double.compare(spell.radius, radius) == 0 && level == spell.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius, level);
    }
}
