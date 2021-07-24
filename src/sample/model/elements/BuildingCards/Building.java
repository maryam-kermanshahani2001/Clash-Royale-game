package sample.model.elements.BuildingCards;

import sample.model.Speed;
import sample.model.Target;
import sample.model.elementsss.BuildingType;
import sample.model.elements.ComponentCards;

import java.util.Objects;

/**
 * The type Building.
 */
public class Building extends ComponentCards {

//    private BuildingType buildingType;

    private int lifeTime;

    /**
     * Instantiates a new Building.
     *
     * @param HP       the hp
     * @param damage   the damage
     * @param hitSpeed the hit speed
     * @param target   the target
     * @param range    the range
     * @param cost     the cost
     * @param lifeTime the life time
     * @param name     the name
     */
    public Building(int HP, int damage, double hitSpeed, Target target, double range, int cost, int lifeTime, String name) {
        super(HP, damage, hitSpeed, target, range, cost, name);
        this.lifeTime = lifeTime;
//        this.buildingType = buildingType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Building building = (Building) o;
        return lifeTime == building.lifeTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lifeTime);
    }

    @Override
    public void act() {

    }
}
