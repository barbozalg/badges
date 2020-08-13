/**
 * @author barbozalg on Jun 23 2020.
 *
 * Assignment:
 * Write an application to find out how many total characters can be held in a single
 * StringBuilder before running out of memory, translate that number of characters to
 * the number of bytes held by that StringBuilder before crashing.
 */

package barbozalg.total_characters;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        TotalCharacters.run();
    }
}
