package sample.model.elements.SpellCards;

/**
 * The type Fireball.
 */
public class Fireball extends Spell{

    private int areaDamage;

    /**
     * Instantiates a new Fireball.
     */
    public Fireball() {
        super(4, 2.5, "Fireball");
        areaDamage = 325;
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
                areaDamage = 325;
                break;

            case 2:
                areaDamage = 357;
                break;

            case 3:
                areaDamage = 393;
                break;

            case 4:
                areaDamage = 432;
                break;

            case 5:
                areaDamage = 474;
                break;
        }
    }
}
