package sample.model.elements.TroopCards;

import sample.model.Speed;
import sample.model.Target;

public class Barbarian extends Troop {
    public Barbarian() {
        super(300, 75, 1.5, Speed.MEDIUM, Target.GROUND, 1, false, 4, 5, "Barbarian");
    }

    public void setLevelInfo(int level) {
        setLevel(level);

        switch (level) {
            case 1:
                setHP(300);
                setDamage(75);
                break;

            case 2:
                setHP(330);
                setHP(82);
                break;
            case 3:
                setHP(363);
                setDamage(90);
                break;

            case 4:
                setHP(438);
                setDamage(99);
                break;

            case 5:
                setHP(480);
                setDamage(109);
                break;
        }
    }
}
