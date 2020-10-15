/**
 * @author barbozalg on Jun 30 2020.
 *
 * Assignment:
 * Create and overload constructors -- Create a class that has 4 fields and construct the class with variations of one required field and the others are optional.  Use constructor chaining as an example.
 */

package com.barbozalg.overloadconstructors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class OverloadConstructorsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OverloadConstructorsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Deck blueFullDeck = new Deck();
        Deck redFullDeck = new Deck();
        for (CardType type : CardType.values()) {
            for (int i = 1; i < 14; i++) {
                blueFullDeck.putCard(new Card(i, type));
            }
        }
        for (CardType type : CardType.values()) {
            for (int i = 1; i < 14; i++) {
                redFullDeck.putCard(new Card(i, type, "Red"));
            }
        }
        System.out.println("Blue Deck\n" + blueFullDeck.toString());
        System.out.println("Red Deck\n" + redFullDeck.toString());
        Stack allDecks = new Stack();
        allDecks.addDeck(blueFullDeck);
        allDecks.addDeck(redFullDeck);
        System.out.println("The Stack\n" + allDecks.toString());
    }

}
