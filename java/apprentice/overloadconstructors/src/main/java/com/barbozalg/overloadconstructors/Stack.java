/**
 * @author barbozalg on Jun 30 2020.
 */

package com.barbozalg.overloadconstructors;

import java.util.ArrayList;
import java.util.List;


public class Stack extends Deck {

    private final int MAX = 416;
    private List<Card> cards;

    public Stack() {
        this.cards = new ArrayList<>();
    }

    public void addDeck(Deck deck){
        List<Card> newList = new ArrayList<Card>(this.cards);
        newList.addAll(deck.cards);
        this.cards = newList;
    }

    public java.lang.String toString(){
        return "Max Num of Cards: " + this.MAX + "\nCurrent Num of Cards: " + this.cards.size() + "\n";
    }

}
