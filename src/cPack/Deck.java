package cPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {
    private ArrayList<Card> content = new ArrayList<Card>();

    public Deck(){
        Rank.stream().filter(r -> r.getValue() > 0).forEach(rank -> {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit);
                this.content.add(card);
            }
        }
        );
    }

    public Deck(ArrayList<Card> cards){
        this.content = cards;
    }

    public void addJoker(){
        content.add(new Card(Rank.JOKER, Suit.HEARTS));
    }

    public void shuffle(){

    }

    public boolean isEmpty(){
        return content.isEmpty();
    }

    public Card pop(){
        if(!isEmpty()){
            return content.remove(0);
        }
        return null;
    }

    public void push(Card card){
        content.add(card);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "content=" + content +
                '}';
    }
}
