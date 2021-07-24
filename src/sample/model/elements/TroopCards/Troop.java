package sample.model.elements.TroopCards;

import sample.model.Speed;
import sample.model.Target;
import sample.model.elements.ComponentCards;

import java.util.Objects;

/**
 * The type Troop.
 */
public class Troop extends ComponentCards {
    private Speed speed;
    private int count;
    private boolean isAreaSplash;

    /**
     * Instantiates a new Troop.
     *
     * @param HP           the hp
     * @param damage       the damage
     * @param hitSpeed     the hit speed
     * @param speed        the speed
     * @param target       the target
     * @param range        the range
     * @param isAreaSplash the is area splash
     * @param count        the count
     * @param cost         the cost
     * @param name         the name
     */
    public Troop(int HP, int damage, double hitSpeed, Speed speed, Target target, double range, boolean isAreaSplash, int count, int cost, String name) {
        super(HP, damage, hitSpeed, target, range, cost, name);
        this.speed = speed;
        this.count = count;
        this.isAreaSplash = isAreaSplash;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Troop troop = (Troop) o;
        return count == troop.count && isAreaSplash == troop.isAreaSplash && speed == troop.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, count, isAreaSplash);
    }

    @Override
    public void act() {

    }
}
