/**
 * @author barbozalg on Nov 12 2020.
 */

package com.barbozalg.writemessagejson;

import java.util.Arrays;
import java.util.List;


public class WriteNoStructureFile {

    void create(List<Employee> employees){
        FileMethods fileMethods = new FileMethods();
        String txtContent = "Employees\n";
        int i = 0;
        for (Employee employee: employees) {
            i++;
            txtContent += "\nEmployee " + i + "\n";
            txtContent += "Lastname: " + employee.getLastName() + "\n";
            txtContent += "Firstname: " + employee.getFirstName() + "\n";
        }
        fileMethods.writeFile("textOutput.txt", Arrays.asList(txtContent.split("\n")));
    }

}
