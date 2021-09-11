/**
 * @author barbozalg on Sep 10 2021.
 *
 * Write code that declares, implements and/or extends interfaces.
 */

package com.barbozalg.interfaceclass;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;


@SpringBootApplication
public class InterfaceclassApplication implements CommandLineRunner {

    public String toString(double number){
        return String.format("$ %.2f", (Math.round(number * 100d) / 100d));
    }

    public static void main(String[] args) {
        SpringApplication.run(InterfaceclassApplication.class, args);
    }

    @Override
    public void run(String... args){
        LocalDate currentdate = LocalDate.now();
        Invoice a = new Invoice();
        double productPrice = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product price in US Dollars ($): ");

        while(true) {
            try {
                productPrice = Double.parseDouble(scanner.nextLine());
                if (productPrice > a.getMinimumValue())
                    break;
                else
                    System.out.println("Please enter a product price greater than " + a.getMinimumValue() + ": ");
            } catch (Exception e) {
                System.out.println("Please enter a valid product price:");
            }
        }

        a.assignsValue(productPrice);

        System.out.println("Total before taxes: " + toString(a.withOutTaxes()));
        System.out.println("Total: " + toString(a.withTaxes()));

        Month currentMonth = currentdate.getMonth();

        if (currentMonth == Month.SEPTEMBER){
            System.out.println("Reduced during the month of Sep by 20%");
            a.discount(20);
            System.out.println("Total after discount and before taxes: " + toString(a.withOutTaxes()));
            System.out.println("Total after discount: " + toString(a.withTaxes()));
        }

        if (a.specialCase){
            System.out.println("** Because of invoice amount, you have to keep this");
            System.out.println("   invoice and use it in the tax declaration.");
        }

        System.exit(0);
    }

}
