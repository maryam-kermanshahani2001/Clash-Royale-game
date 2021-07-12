package sample.model.elements;

import sample.model.Speed;
import sample.model.Target;

public class ComponentCards extends Card{
    private int HP;
    private int damage;
    private double hitSpeed;
    private Target target; // target
    private double range; // range
    private int level;


    public ComponentCards(int HP, int damage, double hitSpeed, Target target, double range, int cost) {
        super(cost);
        this.level = 1;
        this.HP = HP;
        this.damage = damage;
        this.hitSpeed = hitSpeed;
        this.target = target;
        this.range = range;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getHitSpeed() {
        return hitSpeed;
    }

    public void setHitSpeed(double hitSpeed) {
        this.hitSpeed = hitSpeed;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
