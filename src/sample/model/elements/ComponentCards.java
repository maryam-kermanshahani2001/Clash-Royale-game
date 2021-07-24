package sample.model.elements;

import sample.model.MapComponent;
import sample.model.Speed;
import sample.model.Target;

/**
 * The type Component cards.
 */
public abstract class ComponentCards extends Card{
    private int HP;
    private int damage;
    private double hitSpeed;
    private Target target; // target
    private double range; // range
    private int level;
    private MapComponent enemy;

    /**
     * Instantiates a new Component cards.
     *
     * @param HP       the hp
     * @param damage   the damage
     * @param hitSpeed the hit speed
     * @param target   the target
     * @param range    the range
     * @param cost     the cost
     * @param name     the name
     */
    public ComponentCards(int HP, int damage, double hitSpeed, Target target, double range, int cost, String name) {
        super(cost, name);
        this.level = 1;
        this.HP = HP;
        this.damage = damage;
        this.hitSpeed = hitSpeed;
        this.target = target;
        this.range = range;
        enemy = new MapComponent();

    }

    /**
     * Gets hp.
     *
     * @return the hp
     */
    public int getHP() {
        return HP;
    }

    /**
     * Sets hp.
     *
     * @param HP the hp
     */
    public void setHP(int HP) {
        this.HP = HP;
    }

    /**
     * Gets damage.
     *
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Sets damage.
     *
     * @param damage the damage
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * Gets hit speed.
     *
     * @return the hit speed
     */
    public double getHitSpeed() {
        return hitSpeed;
    }

    /**
     * Sets hit speed.
     *
     * @param hitSpeed the hit speed
     */
    public void setHitSpeed(double hitSpeed) {
        this.hitSpeed = hitSpeed;
    }

    /**
     * Gets target.
     *
     * @return the target
     */
    public Target getTarget() {
        return target;
    }

    /**
     * Sets target.
     *
     * @param target the target
     */
    public void setTarget(Target target) {
        this.target = target;
    }

    /**
     * Gets range.
     *
     * @return the range
     */
    public double getRange() {
        return range;
    }

    /**
     * Sets range.
     *
     * @param range the range
     */
    public void setRange(double range) {
        this.range = range;
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

    /**
     * Act.
     */
    public abstract void act();
}
