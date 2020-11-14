/**
 * @author barbozalg on Nov 12 2020.
 */

package com.barbozalg.writemessagejson;

import java.util.Arrays;
import java.util.List;


public class WriteJsonFile {

    void create(List<Employee> employees){
        FileMethods fileMethods = new FileMethods();
        String jsonContent = "{\n  \"Employees\": [\n";
        int i = 0;
        for (Employee employee: employees) {
            i++;
            if (i > 1){
                jsonContent += ",\n";
            }
            jsonContent += "    {\n";
            jsonContent += "      \"id\": \"" + i + "\",\n";
            jsonContent += "      \"lastname\": \"" + employee.getLastName() + "\",\n";
            jsonContent += "      \"firstname\": \"" + employee.getFirstName() + "\"\n";
            jsonContent += "    }";
        }
        jsonContent += "\n  ]\n}";
        fileMethods.writeFile("textOutput.json", Arrays.asList(jsonContent.split("\n")));
    }

}
