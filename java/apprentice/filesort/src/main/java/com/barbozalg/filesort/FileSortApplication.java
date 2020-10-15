/**
 * @author barbozalg on Jun 29 2020.
 *
 * Assignment:
 * - Write an application to read a file with 10k lines of text, and output another file with the lines in sorted order (sample file)
 * - Write an application to read a file with 10k lines of text, and output another file with the lines in reverse sorted order
 * - Write your own enum type. Describe when you would use it.
 */

package com.barbozalg.filesort;

import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FileSortApplication implements CommandLineRunner {

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        SpringApplication.run(FileSortApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\nEnter the input file name:");
        String fileName = scanner.nextLine();
        System.out.println("\nEnter the order type:");
        System.out.println(ANSI_YELLOW + "1" + ANSI_WHITE + ") Alphabetical Order [A-Z]");
        System.out.println(ANSI_YELLOW + "2" + ANSI_WHITE + ") Reverse Order [Z-A]");
        int reverse = scanner.nextInt();
        Order order = (reverse == 2)? Order.REVERSE : Order.ORDERED;
        FileSort.sortFile(fileName, order);
    }

}
