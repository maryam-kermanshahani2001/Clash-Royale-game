package sample.model.elements.BuildingCards;

import sample.model.Target;

public class InfernoTower extends Building {
    private int minDamage;
    private int maxDamage;

    public InfernoTower() {
        super(800, 380 / 2, .4, Target.AIR_AND_GROUND, 6, 5, 40, "InfernoTower");
    }

    public void setLevelInfo(int level) {
        setLevel(level);
        switch (level) {
            case 1:
                setHP(800);
                minDamage = 20;
                maxDamage = 400;
                break;

            case 2:
                setHP(880);
                minDamage = 22;
                maxDamage = 440;
                break;
            case 3:
                setHP(968);
                minDamage = 24;
                maxDamage = 484;
                break;
            case 4:
                setHP(1064);
                minDamage = 26;
                maxDamage = 532;
                break;
            case 5:
                setHP(1168);
                minDamage = 29;
                maxDamage = 584;
                break;
        }

    }
}
