/**
 * @author barbozalg on Aug 13 2020.
 */

package com.barbozalg.otherpackage;


public class Auxiliar {

    public Auxiliar(final Scope test) {
        System.out.println("----- Read From Another Class, same package -----");
        // System.out.println(test.a);
        System.out.println("private int a: Private Read Access Restrictions");
        System.out.println("int b (Default): " + test.b);
        System.out.println("protected int c: " + test.c);
        System.out.println("public int d: " + test.d + "\n");

        System.out.println("----- Write From Another Class, same package -----");
        // test.a = 6;
        // System.out.println(test.a);
        System.out.println("private int a: Private Write Access Restrictions");
        test.b = 6;
        System.out.println("int b (Default): " + test.b + ", even though the test object is declared final.");
        test.c = 7;
        System.out.println("protected int c: " + test.c + ", even though the test object is declared final.");
        test.d = 8;
        System.out.println("public int d: " + test.d + ", even though the test object is declared final.\n");
    }

}
