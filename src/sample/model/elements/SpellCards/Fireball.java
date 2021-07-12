package sample.model.elements.SpellCards;

public class Fireball extends Spell{

    private int areaDamage;

    public Fireball() {
        super(4, 2.5);
        areaDamage = 325;
    }

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
