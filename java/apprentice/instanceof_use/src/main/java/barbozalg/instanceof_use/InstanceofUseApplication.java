/**
 * @author barbozalg on Sep 28 2020.
 *
 * Assignment:
 * Write code that uses the instanceof operator and show how casting works.
 */
package barbozalg.instanceof_use;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstanceofUseApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(InstanceofUseApplication.class, args);
    }

    // This function receives variables from the Animal class
    public static void makeItMove(Animal animal){
        /**
         * I did not send Animal class, but all the elements that send are Animal instances
         * and the method immediately cast towards animal.
         */
        animal.move();
    }

    @Override
    public void run(String... args) {
        System.out.println("Animals can:");

        System.out.print("* ");
        // I am sending Fish class not Animal
        makeItMove(new Fish());

        System.out.print("* ");
        // I am sending Bird class not Animal
        makeItMove(new Bird());

        Mammal mammal = new Mammal();
        System.out.print("* ");
        // I am sending Mammal class not Animal
        makeItMove(mammal);

        System.out.print("* ");
        // I am sending Reptile class not Animal
        makeItMove(new Reptile());

        System.out.print("* ");
        // I am sending Amphibian class not Animal
        makeItMove(new Amphibian());

        // Because mammal is an instance of Animal the statement is true
        if(mammal instanceof Animal){
            System.out.println("\nmammal is an instance of Animal.");
        } else {
            System.out.println("\nmammal is not an instance of Animal.");
        }
    }
}
