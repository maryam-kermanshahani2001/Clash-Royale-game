package sample.model.elements.BuildingCards;

import sample.model.Speed;
import sample.model.Target;
import sample.model.elementsss.BuildingType;
import sample.model.elements.ComponentCards;

public class Building extends ComponentCards {

//    private BuildingType buildingType;

    private int lifeTime;

    public Building(int HP, int damage, double hitSpeed, Target target, double range, int cost, int lifeTime, String name) {
        super(HP, damage, hitSpeed, target, range, cost, name);
        this.lifeTime = lifeTime;
//        this.buildingType = buildingType;
    }




}
