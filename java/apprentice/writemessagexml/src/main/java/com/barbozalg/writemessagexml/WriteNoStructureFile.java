/**
 * @author barbozalg on Oct 12 2020.
 */

package com.barbozalg.writemessagexml;

import java.util.Arrays;
import java.util.List;


public class WriteNoStructureFile extends FileMethods {

    @Override void create(List<Employee> employees){
        String txtContent = "Employees\n";
        int i = 0;
        for (Employee employee: employees) {
            i++;
            txtContent += "\nEmployee " + i + "\n";
            txtContent += "Lastname: " + employee.getLastName() + "\n";
            txtContent += "Firstname: " + employee.getFirstName() + "\n";
        }
        writeFile("textOutput.txt", Arrays.asList(txtContent.split("\n")));
    }

}
