package sample.model.mapComponents;

public class Tower {
    private double range;
    private int damage;
    private int HP;
    private double hitSpeed;
    int level;

    public Tower(double range, double hitSpeed) {
        this.range = range;
        this.hitSpeed = hitSpeed;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public double getHitSpeed() {
        return hitSpeed;
    }

    public void setHitSpeed(double hitSpeed) {
        this.hitSpeed = hitSpeed;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
