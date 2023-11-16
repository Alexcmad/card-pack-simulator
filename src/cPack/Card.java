package cPack;


public class Card {
    private final Rank rank;
    private final Suit suit;
    private boolean orientation;

    public Card(Rank r, Suit s){
        rank = r;
        suit = s;
        orientation = false;
    }

    public void flip(){
        orientation = true;
    }

    @Override
    public String toString() {
        return ""+ suit + rank + suit + " " + orientation;
    }
}
