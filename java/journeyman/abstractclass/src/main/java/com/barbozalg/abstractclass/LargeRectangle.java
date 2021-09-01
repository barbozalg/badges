/**
 * @author barbozalg on Aug 31 2021.
 */

package com.barbozalg.abstractclass;


public class LargeRectangle extends Shape {

    private static final String TYPE_NAME = "Large Rectangle";
    int width = 25;
    int length = 12;

    public static void main(String args[]){
        LargeRectangle object = new LargeRectangle();
    }

    public String getTypeName(){
        return TYPE_NAME;
    }

    public double calculateArea(){
        double area = this.width * this.length;
        return area;
    }

}
