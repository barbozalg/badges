/**
 * @author barbozalg on Oct 12 2020.
 *
 * Assignment:
 * two different classes that write a message to a file, one in XML, one in line-oriented text,
 * but both need to reuse logic to open the file in the same way.
 */

package com.barbozalg.writemessage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class WriteMessageApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(WriteMessageApplication.class, args);
    }

    @Override
    public void run(String... args) {
        List<Employee> listOfEmployees = new ArrayList(5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many employees? (up to 5):");
        int numEmployees = 0;
        while(numEmployees == 0) {
            try {
                numEmployees = Integer.parseInt(scanner.nextLine());
                if(numEmployees > 5){
                    System.out.println("Please enter an integer equal or lower than 5 for the number of employees:");
                    numEmployees = 0;
                } else if(numEmployees <= 0){
                    System.out.println("Please enter an integer equal or bigger than 1 for the number of employees:");
                    numEmployees = 0;
                }
            } catch (Exception e) {
                System.out.println("Please enter an integer for the number of employees:");
                numEmployees = 0;
            }
        }
        for(int i=0; i < numEmployees; i++){
            String lastName = "";
            String firstName = "";
            int j = i + 1;
            while(lastName == "") {
                System.out.println("Enter last name(" + j + "):");
                lastName = scanner.nextLine();
            }
            while(firstName == "") {
                System.out.println("Enter first name(" + j + "):");
                firstName = scanner.nextLine();
            }
            listOfEmployees.add(new Employee(lastName, firstName));
        }
        WriteXmlFile xmlFile = new WriteXmlFile();
        xmlFile.create(listOfEmployees);

        WriteNoStructureFile txtFile = new WriteNoStructureFile();
        txtFile.create(listOfEmployees);
    }

}
