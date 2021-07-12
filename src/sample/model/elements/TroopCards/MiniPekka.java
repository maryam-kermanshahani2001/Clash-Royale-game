package sample.model.elements.TroopCards;

import sample.model.Speed;
import sample.model.Target;

public class MiniPekka extends Troop {
    public MiniPekka() {
        super(300, 325, 1.8, Speed.FAST, Target.GROUND, 1, false, 1, 4);
    }


    public void setLevelInfo(int level) {
        setLevel(level);

        switch (level) {
            case 1:
                setHP(600);
                setDamage(325);
                break;

            case 2:
                setHP(660);
                setHP(357);
                break;
            case 3:
                setHP(726);
                setDamage(393);
                break;

            case 4:
                setHP(798);
                setDamage(432);
                break;

            case 5:
                setHP(876);
                setDamage(474);
                break;
        }
    }
}
