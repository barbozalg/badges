/**
 * @author barbozalg on Jun 30 2020.
 *
 * Assignment:
 * Write code to show exception handling including examples of checked, unchecked, and Error exceptions
 */

package barbozalg.error_handler;

import java.io.IOException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main implements CommandLineRunner {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    private void checked_error() throws IOException {
        System.out.println("Checked error, " + ANSI_RED + "IOException" + ANSI_WHITE + " in progress...");
        throw new IOException("Test");
    }

    private int unchecked_error() {
        System.out.println("Unchecked error, " + ANSI_RED + "RuntimeException" + ANSI_WHITE + " in progress...");
        int item = 5/0;
        return item;
    }

    private void unknown_error() {
        System.out.println(ANSI_RED + "Unknown Error" + ANSI_WHITE + " in progress...");
        throw new UnknownError("Test");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(ANSI_CYAN + "\n\n\nError handler demonstration\n" + ANSI_WHITE);
        try {
            checked_error();
        } catch (IOException e) {
            System.out.println("IOException catched. e='" + ANSI_YELLOW + e + ANSI_WHITE + "'");
        }
        try {
            int value = unchecked_error();
            System.out.println("Test: " + value);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException catched. e='" + ANSI_YELLOW + e + ANSI_WHITE + "'");
        }
        try {
            unknown_error();
        } catch (Error e) {
            System.out.println("Error catched. e='" + ANSI_YELLOW + e + ANSI_WHITE + "'");
        }
    }

}
