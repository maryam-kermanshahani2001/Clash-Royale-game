package sample.model.elements.SpellCards;

/**
 * The type Arrow.
 */
public class Arrow extends Spell{
    private int areaDamage;

    /**
     * Instantiates a new Arrow.
     */
    public Arrow() {
        super(3, 4, "Arrow");
        areaDamage = 144;
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
                areaDamage = 144;
                break;

            case 2:
                areaDamage = 156;
                break;

            case 3:
                areaDamage = 174;
                break;

            case 4:
                areaDamage = 189;
                break;

            case 5:
                areaDamage = 210;
                break;
        }
    }
}
