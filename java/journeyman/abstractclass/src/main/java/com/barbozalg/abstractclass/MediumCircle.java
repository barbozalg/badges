/**
 * @author barbozalg on Aug 31 2021.
 */

package com.barbozalg.abstractclass;


public class MediumCircle extends Shape {

    private static final String TYPE_NAME = "Medium Circle";
    int radius = 16;

    public static void main(String args[]){
        MediumCircle object = new MediumCircle();
    }

    public String getTypeName(){
        return TYPE_NAME;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

}
