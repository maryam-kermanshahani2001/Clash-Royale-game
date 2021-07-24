package sample.model.elements.TroopCards;

import sample.model.Speed;
import sample.model.Target;

/**
 * The type Baby dragon.
 */
public class BabyDragon extends Troop {
    /**
     * Instantiates a new Baby dragon.
     */
    public BabyDragon() {
        super(800, 100, 1.8, Speed.FAST, Target.AIR_AND_GROUND, 3, true, 1, 4, "Wizard");

    }

    /**
     * Sets level info.
     *
     * @param level the level
     */
    public void setLevelInfo(int level) {
        setLevel(level);
        switch (level) {
            case 1:
                setHP(800);
                setDamage(100);
                break;

            case 2:
                setHP(880);
                setHP(110);
                break;
            case 3:
                setHP(968);
                setDamage(121);
                break;

            case 4:
                setHP(1064);
                setDamage(133);
                break;

            case 5:
                setHP(1168);
                setDamage(146);
                break;
        }
    }
}
