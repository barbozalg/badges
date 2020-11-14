/**
 * @author barbozalg on Aug 13 2020.
 *
 * Assignment:
 * Write code to show how access modifiers work: private, protected, and public,
 * talk about why you would use each of these.
 */

package com.barbozalg.accessmodifiers;

import com.barbozalg.otherpackage.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AccessModifiersApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AccessModifiersApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scope test = new Scope();
        new Auxiliar(test);
        System.out.println("----- Read From Another Package -----");
        // System.out.println(test.a);
        System.out.println("private int a: Private Read Access Restrictions");
        // System.out.println("int b (Default): " + test.b);
        System.out.println("int b (Default): Private Read Access Restrictions");
        // System.out.println("protected int c: " + test.c);
        System.out.println("protected int c: Private Read Access Restrictions");
        System.out.println("public int d: " + test.d + "\n");

        System.out.println("----- Write From Another Package -----");
        // test.a = 5;
        // System.out.println(test.a);
        System.out.println("private int a: Private Write Access Restrictions");
        // test.b = 6;
        // System.out.println("int b (Default): " + test.b);
        System.out.println("int b (Default): Private Read Access Restrictions");
        // test.c = 7;
        // System.out.println("protected int c: " + test.c);
        System.out.println("protected int c: Private Read Access Restrictions");
        test.d = 9;
        System.out.println("public int d: " + test.d + "\n");
    }

}
