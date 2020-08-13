package barbozalg.access_modifiers;

import barbozalg.other_package.*;
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
        new Auxiliar(test);
        System.out.println("----- Read From Another Package -----");
        // System.out.println(test.a);
        System.out.println("private int a: Private Read Access Restrictions");
        // System.out.println("int b (Default): " + test.b);
        System.out.println("int b (Default): Private Read Access Restrictions");
        // System.out.println("protected int c: " + test.c);
        System.out.println("protected int c: Private Read Access Restrictions");
        System.out.println("public int d: " + test.d + "\n");

        System.out.println("----- Write From Another Package -----");
        // System.out.println(test.a);
        System.out.println("private int a: Private Write Access Restrictions");
        //test.b = 6;
        //System.out.println("int b (Default): " + test.b);
        System.out.println("int b (Default): Private Read Access Restrictions");
        //test.c = 7;
        //System.out.println("protected int c: " + test.c);
        System.out.println("protected int c: Private Read Access Restrictions");
        test.d = 9;
        System.out.println("public int d: " + test.d + "\n");
    }

}
