/**
 * @author barbozalg on Jun 30 2020.
 *
 * Assignment:
 * Create and overload constructors -- Create a class that has 4 fields and construct the class with variations of one required field and the others are optional.  Use constructor chaining as an example.
 */

package barbozalg.overload_constructors;

import java.util.List;
import java.util.ArrayList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Deck blueFullDeck = new Deck();
        Deck redFullDeck = new Deck();
        for (cardType type : cardType.values()) {
            for (int i = 1; i < 14; i++) {
                blueFullDeck.putCard(new Card(i, type));
            }
        }
        for (cardType type : cardType.values()) {
            for (int i = 1; i < 14; i++) {
                redFullDeck.putCard(new Card(i, type, "Red"));
            }
        }

        System.out.println("Luis");


//        List<Card> people = new ArrayList<>();
//        System.out.println("Creating a group of people");
//
//        System.out.println(String.format("First a default student with id=%s", FIRST_STUDENT_ID));
//
//        people.add(new Deck(FIRST_STUDENT_ID));
//
//        System.out.println(String.format("And now a student named Jessy with id=%s", SECOND_STUDENT_ID));
//        people.add(new Deck(SECOND_STUDENT_ID, "Jessy"));
//
//        System.out.println(String.format("And now a student named Fred with id=%s, who is 26 years old.", THIRD_STUDENT_ID));
//        people.add(new Deck(THIRD_STUDENT_ID, "Fred", 26));
//
//
//        System.out.println(String.format("And now a student named George with id=%s, who is 29 years old with a gpa of 1.2", FOURTH_STUDENT_ID));
//        people.add(new Deck(FOURTH_STUDENT_ID, "George", 29, 1.2));
//
//        System.out.println(String.format("And now a random person named Timmy, age 7"));
//        people.add(new Card(7, "Timmy"));
//
//        System.out.println("Outputting all people");
//        System.out.println(people);
//
//        System.out.println("Outputting gpa for those who are students");
//        for (Card card : people) {
//            if (card instanceof Deck) {
//                System.out.println(String.format("Name: %s, GPA=%.2f", card.getType(), ((Deck) card).getGpa()));
//            }
//            else {
//                System.out.println(String.format("%s is not a student", card.getType()));
//            }
//        }

    }

}
