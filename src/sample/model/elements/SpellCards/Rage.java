package sample.model.elements.SpellCards;

public class Rage extends Spell{
    private double duration;

    public Rage() {
        super(3, 5);
        duration = 6;
    }
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
