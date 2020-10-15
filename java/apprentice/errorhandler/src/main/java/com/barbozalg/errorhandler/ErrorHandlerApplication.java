/**
 * @author barbozalg on Jun 30 2020.
 *
 * Assignment:
 * Write code to show exception handling including examples of checked, unchecked, and Error exceptions.
 */

package com.barbozalg.errorhandler;

import java.io.IOException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ErrorHandlerApplication implements CommandLineRunner {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        SpringApplication.run(ErrorHandlerApplication.class, args);
    }

    private void checkedError() throws IOException {
        System.out.println("Checked error, " + ANSI_RED + "IOException" + ANSI_WHITE + " in progress...");
        throw new IOException("Test");
    }

    private int uncheckedError() {
        System.out.println("Unchecked error, " + ANSI_RED + "RuntimeException" + ANSI_WHITE + " in progress...");
        int item = 5/0;
        return item;
    }

    private void unknownError() {
        System.out.println(ANSI_RED + "Unknown Error" + ANSI_WHITE + " in progress...");
        throw new UnknownError("Test");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(ANSI_CYAN + "\n\n\nError handler demonstration\n" + ANSI_WHITE);
        try {
            checkedError();
        } catch (IOException e) {
            System.out.println("IOException catched. e='" + ANSI_YELLOW + e + ANSI_WHITE + "'");
        }
        try {
            int value = uncheckedError();
            System.out.println("Test: " + value);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException catched. e='" + ANSI_YELLOW + e + ANSI_WHITE + "'");
        }
        try {
            unknownError();
        } catch (Error e) {
            System.out.println("Error catched. e='" + ANSI_YELLOW + e + ANSI_WHITE + "'");
        }
    }

}
