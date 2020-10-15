/**
 * @author barbozalg on Aug 13 2020.
 */

package com.barbozalg.otherpackage;


public class Auxiliar {

    public Auxiliar(Scope test) {
        System.out.println("----- Read From Another Class, same package -----");
        // System.out.println(test.a);
        System.out.println("private int a: Private Read Access Restrictions");
        System.out.println("int b (Default): " + test.b);
        System.out.println("protected int c: " + test.c);
        System.out.println("public int d: " + test.d + "\n");

        System.out.println("----- Write From Another Class, same package -----");
        // System.out.println(test.a);
        System.out.println("private int a: Private Write Access Restrictions");
        test.b = 6;
        System.out.println("int b (Default): " + test.b);
        test.c = 7;
        System.out.println("protected int c: " + test.c);
        test.d = 8;
        System.out.println("public int d: " + test.d + "\n");
    }

}
