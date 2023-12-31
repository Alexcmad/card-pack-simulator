package cPack;


public class Card {
    private final Rank rank;
    private final Suit suit;
    private boolean orientation;

    public Card(Rank r, Suit s){
        rank = r;
        suit = s;
        orientation = true;
    }

    public void flip(){
        orientation = !orientation;
    }

    @Override
    public String toString() {
        if (orientation)
        return ""+ suit + rank + suit;
        else
            return "[Hidden]";
    }
}
