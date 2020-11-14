/**
 * @author barbozalg on Nov 12 2020.
 */

package com.barbozalg.writemessagejson;


public final class Employee{
    private final String lastName;
    private final String firstName;


    public Employee(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

}
