package sample.model.mapComponents;

/**
 * The type Queen tower.
 */
public class QueenTower extends Tower{
    /**
     * Instantiates a new Queen tower.
     */
    public QueenTower() {
        super(7.5, 0.8);
    }

    /**
     * Sets level info.
     *
     * @param level the level
     */
/* public void upgrade() {
        level++;
    }*/
    public void setLevelInfo(int level) {
        setLevel(level);

        switch (level) {
            case 1:
                setHP(1400);
                setDamage(50);
                break;
            case 2:
                setHP(1512);
                setDamage(54);
                break;

            case 3:
                setHP(1624);
                setDamage(58);
                break;
            case 4:
                setHP(1750);
                setDamage(62);
                break;

            case 5:
                setHP(1890);
                setDamage(69);
                break;

        }
    }

}
