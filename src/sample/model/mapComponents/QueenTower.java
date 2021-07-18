package sample.model.mapComponents;

public class QueenTower extends Tower{
    public QueenTower() {
        super(7.5, 0.8);
    }
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
