/**
 * @author barbozalg on Aug 17 2020.
 *
 * Assignment:
 * - Determine the effect upon object references and primitive values when they are passed
 *   into methods that change the values -- Create a method 3 parameters, one is parameter
 *   is pass by value, one is passed by reference and one with the keyword final.  Explain
 *   each and what the effects inside the method that changes each one.
 */

package com.barbozalg.argumenthandler;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


class MyInt {
    // public member variable
    public int entero;

    // default constructor
    public MyInt(){
        entero = 2;
    }

}

@SpringBootApplication
public class ArgumentHandlerApplication implements CommandLineRunner{

    static final Logger logger = Logger.getLogger(ArgumentHandlerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ArgumentHandlerApplication.class, args);
    }

    public void argumentHandler(int a, MyInt b, final int c){
        logger.info("--- Received in method ---");
        logger.info("a: " + a + " (Received by value)");
        logger.info("b: " + b.entero + " (Received by reference)");
        logger.info("c: " + c + " (Received as final)");
        a += 3;
        b.entero += 3;
        // c += 3;
        logger.info("--- Modified in method ---");
        logger.info("a: " + a);
        logger.info("b: " + b.entero);
        logger.info("c: " + c + " (It was not modified because FINAL)");
    }

    @Override
    public void run(String... args) {
        BasicConfigurator.configure();
        int x = 1;
        MyInt y = new MyInt();
        int z = 3;
        logger.info("--- Before method ---");
        logger.info("x: " + x);
        logger.info("y: " + y.entero);
        logger.info("z: " + z);
        argumentHandler(x,y,z);
        logger.info("--- After method ---");
        logger.info("x: " + x + " (Passed by value, it was not modified)");
        logger.info("y: " + y.entero + " (It was modified in the method)");
        logger.info("z: " + z + " (Passed as final. Can not be modified in the method and does not modified the origin)");
    }

}
