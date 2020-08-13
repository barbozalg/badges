/**
 * @author barbozalg on Jun 30 2020.
 */

package barbozalg.overload_constructors;


import java.util.ArrayList;
import java.util.List;

public class Stack extends Deck {

    private final int MAX = 416;
    private List<Card> cards;

    public Stack() {
        this.cards = new ArrayList<>();
    }

}
