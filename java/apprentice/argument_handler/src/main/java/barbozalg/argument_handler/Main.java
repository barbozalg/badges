/**
 * @author barbozalg on Aug 17 2020.
 *
 * Assignment:
 * - Determine the effect upon object references and primitive values when they are passed
 *   into methods that change the values -- Create a method 3 parameters, one is parameter
 *   is pass by value, one is passed by reference and one with the keyword final.  Explain
 *   each and what the effects inside the method that changes each one.
 */

package barbozalg.argument_handler;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class my_int {
    // public member variable
    public int entero;

    // default constructor
    public my_int(){
        entero = 2;
    }

}


@SpringBootApplication
public class Main implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    public void argument_handler(int a, my_int b, final int c){
        System.out.println("--- Received in method ---");
        System.out.println("a: " + a + " (Received by value)");
        System.out.println("b: " + b.entero + " (Received by reference)");
        System.out.println("c: " + c + " (Received as final)");
        a += 3;
        b.entero += 3;
        // c += 3;
        System.out.println("--- Modified in method ---");
        System.out.println("a: " + a);
        System.out.println("b: " + b.entero);
        System.out.println("c: " + c + " (It was not modified because FINAL)");
    }

    @Override
    public void run(String... args) {
        int x = 1;
        my_int y = new my_int();
        int z = 3;
        System.out.println("--- Before method ---");
        System.out.println("x: " + x);
        System.out.println("y: " + y.entero);
        System.out.println("z: " + z);
        argument_handler(x,y,z);
        System.out.println("--- After method ---");
        System.out.println("x: " + x + " (Passed by value, it was not modified)");
        System.out.println("y: " + y.entero + " (It was modified in the method)");
        System.out.println("z: " + z + " (Passed as final. Can not be modified in the method and does not modified the origin)");
    }

}
