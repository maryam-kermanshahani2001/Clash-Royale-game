package sample.model.elements.SpellCards;

public class Arrow extends Spell{
    private int areaDamage;

    public Arrow() {
        super(3, 4);
        areaDamage = 144;
    }


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
