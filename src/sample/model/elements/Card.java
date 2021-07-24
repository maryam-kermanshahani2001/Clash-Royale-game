package sample.model.elements;

import sample.model.MapComponent;

import java.util.Objects;

/**
 * The type Card.
 */
public class Card extends MapComponent {
    private int cost;
//    private int level;
    private String name;

    /**
     * Instantiates a new Card.
     *
     * @param cost the cost
     * @param name the name
     */
    public Card(int cost,String name) {
        this.cost = cost;
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cost == card.cost && Objects.equals(name, card.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, name);
    }

    /**
     * Gets cost.
     *
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * Sets cost.
     *
     * @param cost the cost
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    //
//    public void setLevel(int level) {
//        this.level = level;
//    }
}
