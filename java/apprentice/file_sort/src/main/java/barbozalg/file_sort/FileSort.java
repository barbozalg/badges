/**
 * @author barbozalg on Jun 29 2020.
 */

package barbozalg.file_sort;

import java.io.*;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import org.springframework.stereotype.Service;


@Service
public class FileSort {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private static List<String> read_file(String file_name) {
        List<String> lines = new LinkedList<>();
        try(BufferedReader inputFile = new BufferedReader(new FileReader(file_name))) {
            System.out.println("\nReading file.");
            String line = inputFile.readLine();
            while (line != null) {
                lines.add(line);
                line = inputFile.readLine();
            }
            System.out.println("'" + ANSI_BLUE + file_name + ANSI_WHITE + "' was successfully read.");
        } catch(IOException e) {
            System.out.println("\nError occurred when tried to read file. e='" + e + "'");
        }
        return lines;
    }

    private static void output_lines(List<String> lines) {
        try(BufferedWriter op_file = new BufferedWriter(new FileWriter("result.txt", false))) {
            for(String outputLines: lines) {
                op_file.write(outputLines);
                op_file.newLine();
            }
            System.out.println("'" + ANSI_CYAN + "result.txt" + ANSI_WHITE + "' was successfully created.");
        } catch(IOException e) {
            System.out.println("Error occurred when tried to write file. e='" + e + "'");
        }
    }

    public static void sort_file(String file_name, Order order) {
        List<String> lines = read_file(file_name);
        if (Order.REVERSE.equals(order)) {
            System.out.println("Ordering in Reverse");
            lines.sort(Collections.reverseOrder());
        } else {
            System.out.println("ordering Alphabetically");
            Collections.sort(lines);
        }
        output_lines(lines);
    }
}