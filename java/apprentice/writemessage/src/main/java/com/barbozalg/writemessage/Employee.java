/**
 * @author barbozalg on Oct 12 2020.
 */

package com.barbozalg.writemessage;


public class Employee{
    private String lastName;
    private String firstName;


    public Employee(String lastName, String firstName){
        setLastName(lastName);
        setFirstName(firstName);
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

}