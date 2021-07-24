package sample.model.elements.SpellCards;

/**
 * The type Rage.
 */
public class Rage extends Spell{
    private double duration;

    /**
     * Instantiates a new Rage.
     */
    public Rage() {
        super(3, 5, "Rage");
        duration = 6;
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
                duration = 6;
                break;
            case 2:
                duration = 6.5;
                break;
            case 3:
                duration = 7;
                break;
            case 4:
                duration = 7.5;
                break;
            case 5:
                duration = 8;
                break;
        }
    }


}
