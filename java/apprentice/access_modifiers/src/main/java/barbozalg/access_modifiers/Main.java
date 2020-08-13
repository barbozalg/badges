package barbozalg.access_modifiers;

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
        scope test = new scope();
        System.out.println("----- Read From Another class -----");
        // System.out.println(test.a);
        System.out.println("private int a: Private Read Access Restrictions");
        System.out.println("int b (Default): " + test.b);
        System.out.println("protected int c: " + test.c);
        System.out.println("public int d: " + test.d + "\n");

        System.out.println("----- Write From Another class -----");
        // System.out.println(test.a);
        System.out.println("private int a: Private Write Access Restrictions");
        test.b = 6;
        System.out.println("int b (Default): " + test.b);
        test.c = 7;
        System.out.println("protected int c: " + test.c);
        test.d = 8;
        System.out.println("public int d: " + test.d + "\n");
    }

}
