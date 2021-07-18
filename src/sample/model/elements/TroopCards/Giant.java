package sample.model.elements.TroopCards;

import sample.model.Speed;
import sample.model.Target;

public class Giant extends Troop {
    public Giant() {
        super(2000, 126, 1.5, Speed.SLOW, Target.GROUND, 1, false, 1, 5, "Giant");

    }


    public void setLevelInfo(int level) {
        setLevel(level);

        switch (level) {
            case 1:
                setHP(2000);
                setDamage(126);
                break;

            case 2:
                setHP(2200);
                setHP(138);
                break;
            case 3:
                setHP(2420);
                setDamage(152);
                break;

            case 4:
                setHP(2660);
                setDamage(167);
                break;

            case 5:
                setHP(2920);
                setDamage(183);
                break;
        }
    }
}
