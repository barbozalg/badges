/**
 * @author barbozalg on Nov 12 2020.
 */

package com.barbozalg.writemessagejson;

import java.util.Arrays;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileMethods {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void FileMethods(){

    }

    void create(){
        String content = "Just testing\ncorrect";
        writeFile("test.txt", Arrays.asList(content.split("\n")));
    }

    public static void writeFile(String fileName, List<String> lines) {
        try(BufferedWriter outputFile = new BufferedWriter(new FileWriter(fileName, false))) {
            for(String outputLines: lines) {
                outputFile.write(outputLines);
                outputFile.newLine();
            }
            System.out.println("\n'" + ANSI_CYAN + fileName + ANSI_WHITE + "' was successfully created.");
        } catch(IOException e) {
            System.out.println("Error occurred when tried to write file. e='" + e + "'");
        }
    }

}
