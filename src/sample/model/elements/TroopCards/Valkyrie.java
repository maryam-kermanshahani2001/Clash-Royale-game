package sample.model.elements.TroopCards;

import sample.model.Speed;
import sample.model.Target;

public class Valkyrie extends Troop {
    public Valkyrie() {
        super(880, 120, 1.5, Speed.MEDIUM, Target.GROUND, 1, true, 1, 4);

    }

    public void setLevelInfo(int level) {
        setLevel(level);

        switch (level) {
            case 1:
                setHP(880);
                setDamage(120);
                break;

            case 2:
                setHP(968);
                setHP(132);
                break;
            case 3:
                setHP(1064);
                setDamage(145);
                break;

            case 4:
                setHP(1170);
                setDamage(159);
                break;

            case 5:
                setHP(1284);
                setDamage(175);
                break;
        }
    }
}
