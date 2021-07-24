package sample.model.mapComponents;

/**
 * The type King tower.
 */
public class KingTower extends Tower {
    /**
     * Instantiates a new King tower.
     */
    public KingTower() {
        super(7, 1);
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
                setHP(2400);
                setDamage(50);
                break;
            case 2:
                setHP(2568);
                setDamage(53);
                break;

            case 3:
                setHP(2736);
                setDamage(57);
                break;
            case 4:
                setHP(2904);
                setDamage(60);
                break;

            case 5:
                setHP(3096);
                setDamage(64);
                break;

        }
    }


}
