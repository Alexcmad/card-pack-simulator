package cPack;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private String playerName;


    public Player(String name, ArrayList<Card> deal){
        this.hand = deal;
        this.playerName = name;
    }

    public boolean isHolding(Card card) {return hand.contains(card);}

    public void place(Card card, Deck deck){
        deck.push(card);
        hand.remove(card);
    }


}
