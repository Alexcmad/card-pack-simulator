import cPack.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Card testCard = new Card(Rank.FOUR, Suit.DIAMONDS);
        ArrayList<Card> testCards = new ArrayList<Card>();
        Deck testDeck1 = new Deck();
        Deck testDeck2 = new Deck(testCards);
        System.out.println(testCard);
        System.out.println(testDeck1);
    }
}