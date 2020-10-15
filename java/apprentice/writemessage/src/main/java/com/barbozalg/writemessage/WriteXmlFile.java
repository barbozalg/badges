/**
 * @author barbozalg on Oct 12 2020.
 */

package com.barbozalg.writemessage;

import java.util.Arrays;
import java.util.List;


public class WriteXmlFile extends FileMethods {

    @Override void create(List<Employee> employees){
        String xmlContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<Employees>\n";
        int i = 0;
        for (Employee employee: employees) {
            i++;
            xmlContent += "  <Employee id=\"" + i + "\">\n";
            xmlContent += "    <lastname>" + employee.getLastName() + "</lastname>\n";
            xmlContent += "    <firstname>" + employee.getFirstName() + "</firstname>\n";
            xmlContent += "  </Employee>\n";
        }
        xmlContent += "</Employees>";
        writeFile("textOutput.xml", Arrays.asList(xmlContent.split("\n")));
    }

}
