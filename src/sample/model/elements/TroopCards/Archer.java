package sample.model.elements.TroopCards;

import sample.model.Speed;
import sample.model.Target;

public class Archer extends Troop {
    public Archer() {
        super(125, 75, 1.5, Speed.MEDIUM, Target.GROUND, 1, false, 4, 5);

    }

    public void setLevelInfo(int level) {
        super.setLevel(level);
        switch (level) {
            case 1:
                setHP(125);
                setDamage(33);
                break;

            case 2:
                setHP(127);
                setHP(44);
                break;
            case 3:
                setHP(151);
                setDamage(48);
                break;

            case 4:
                setHP(166);
                setDamage(53);
                break;

            case 5:
                setHP(182);
                setDamage(58);
                break;
        }
    }
}
