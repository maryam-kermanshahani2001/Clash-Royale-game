package sample.model.elements.TroopCards;

import sample.model.Speed;
import sample.model.Target;
import sample.model.elements.ComponentCards;

public class Troop extends ComponentCards {
    private Speed speed;
    private int count;
    private boolean isAreaSplash;

    public Troop(int HP, int damage, double hitSpeed, Speed speed, Target target, double range, boolean isAreaSplash, int count, int cost) {
        super(HP, damage, hitSpeed, target, range, cost);
        this.speed = speed;
        this.count = count;
        this.isAreaSplash = isAreaSplash;
    }
}
