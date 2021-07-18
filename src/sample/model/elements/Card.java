package sample.model.elements;

public class Card {
    private int cost;
//    private int level;
    private String name;

    public Card(int cost,String name) {
        this.cost = cost;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //
//    public void setLevel(int level) {
//        this.level = level;
//    }
}
