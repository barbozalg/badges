/**
 * @author barbozalg on Aug 13 2020.
 */

package com.barbozalg.otherpackage;


public class Scope {
    private int a;
    int b;
    protected int c;
    public int d;

    public Scope(){
        this.a = 1;
        this.b = 2;
        this.c = 3;
        this.d = 4;

        System.out.println("----- Read From same Class -----");
        System.out.println("private int a: " + this.a);
        System.out.println("int b (Default): " + this.b);
        System.out.println("protected int c: " + this.c);
        System.out.println("public int d: " + this.d + "\n");

        System.out.println("----- Write From same Class -----");
        this.a += 1;
        System.out.println("private int a: " + this.a);
        this.b += 1;
        System.out.println("int b (Default): " + this.b);
        this.c += 1;
        System.out.println("protected int c: " + this.c);
        this.d += 1;
        System.out.println("public int d: " + this.d + "\n");
    }

}
