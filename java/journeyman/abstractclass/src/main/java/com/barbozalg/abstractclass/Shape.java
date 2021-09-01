/**
 * @author barbozalg on Aug 31 2021.
 */

package com.barbozalg.abstractclass;


abstract class Shape{

    static final String UNIT = "ft²";

    public abstract String getTypeName();

    abstract public double calculateArea();

}
