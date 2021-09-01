/**
 * @author barbozalg on Aug 31 2021.
 */

package com.barbozalg.abstractclass;


public class HugeTriangle extends Shape {

    private static final String TYPE_NAME = "Huge Triangle";
    double base = 500.33;
    double height = 98.25;

    public static void main(String args[]){
        HugeTriangle object = new HugeTriangle();
    }

    public String getTypeName(){
        return TYPE_NAME;
    }

    public double calculateArea(){
        return this.base * this.height / 2;
    }

}
