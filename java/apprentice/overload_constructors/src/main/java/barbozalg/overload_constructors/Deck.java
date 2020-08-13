/**
 * @author barbozalg on Jun 30 2020.
 */

package barbozalg.overload_constructors;


import java.util.ArrayList;
import java.util.List;


public class Deck {

    public int pointer = 0;
    public final int MIN = 0;
    public final int MAX = 52;
    public List<Card> cards;


    public Deck() {
        this.cards = new ArrayList<>();
    }

    public void putCard(Card card) throws Exception {
        if (this.pointer < this.MAX) {
            this.cards.add(card);
            this.pointer++;
        } else {
            throw new Exception("Error: Can not put more cards");
        }
    }

    public Card takeOneCard() throws Exception {
        if (this.pointer > this.MIN) {
            Card card = this.cards.remove(this.pointer);
            this.pointer--;
            return card;
        } else {
            throw new Exception("Error: No Cards to take");
        }
    }

    public int getPointer() {
        return pointer;
    }

    public int getMIN() {
        return MIN;
    }

    public int getMAX() {
        return MAX;
    }

}
