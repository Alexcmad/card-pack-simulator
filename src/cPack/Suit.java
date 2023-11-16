package cPack;

public enum Suit {
    SPADE("♠"),
    CLUBS("♣"),
    DIAMONDS("♦"),
    HEARTS("♥");

    private final String symbol;

    Suit(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol(){
        return symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}



