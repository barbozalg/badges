/**
 * @author barbozalg on Aug 31 2021.
 */

package com.barbozalg.abstractclass;


public class SmallRectangle extends Shape {

    private static final String TYPE_NAME = "Small Rectangle";
    int width = 8;
    int length = 5;

    public static void main(String args[]){
        SmallRectangle object = new SmallRectangle();
    }

    public String getTypeName(){
        return TYPE_NAME;
    }

    public double calculateArea(){
        double area = this.width * this.length;
        return area;
    }

}
