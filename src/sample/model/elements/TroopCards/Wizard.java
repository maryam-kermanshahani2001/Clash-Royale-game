package sample.model.elements.TroopCards;

import sample.model.Speed;
import sample.model.Target;

/**
 * The type Wizard.
 */
public class Wizard extends Troop {
    /**
     * Instantiates a new Wizard.
     */
    public Wizard() {
        super(340, 130, 1.7, Speed.MEDIUM, Target.AIR_AND_GROUND, 5, true, 1, 5, "Wizard");
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
                setHP(340);
                setDamage(130);
                break;

            case 2:
                setHP(374);
                setHP(143);
                break;
            case 3:
                setHP(411);
                setDamage(157);
                break;

            case 4:
                setHP(452);
                setDamage(172);
                break;

            case 5:
                setHP(496);
                setDamage(189);
                break;
        }
    }
}
