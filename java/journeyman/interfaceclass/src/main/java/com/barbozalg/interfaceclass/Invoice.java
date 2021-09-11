/**
 * @author barbozalg on Sep 10 2021.
 */

package com.barbozalg.interfaceclass;


public class Invoice implements Constants, Variations {

    private double totalWithOutTaxes;
    public boolean specialCase;


    public void assignsValue(double x) {
        this.totalWithOutTaxes = Math.max(x, this.minimumValue);
        this.specialCase = x > this.maximumValue;
    }

    public double withOutTaxes() {
        return this.totalWithOutTaxes;
    }

    public double withTaxes() {
        return this.totalWithOutTaxes * (1 + taxSalesRate);
    }

    public void discount(double t) {
        this.totalWithOutTaxes *= (1-t/100);
    }

    public double getMinimumValue(){
        return this.minimumValue;
    }

}
