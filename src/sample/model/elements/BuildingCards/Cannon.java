package sample.model.elements.BuildingCards;

import sample.model.Target;
import sample.model.elements.BuildingCards.Building;
import sample.model.elementsss.BuildingType;

/**
 * The type Cannon.
 */
public class Cannon extends Building {
    /**
     * Instantiates a new Cannon.
     */
    public Cannon() {
        super(380, 60, .8, Target.GROUND, 5.5, 6, 30, "Cannon");
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
                setHP(380);
                setDamage(60);
                break;
            case 2:
                setHP(418);
                setDamage(66);
                break;

            case 3:
                setHP(459);
                setDamage(72);
                break;
            case 4:
                setHP(505);
                setDamage(79);
                break;

            case 5:
                setHP(554);
                setDamage(87);
                break;

        }
    }
}
