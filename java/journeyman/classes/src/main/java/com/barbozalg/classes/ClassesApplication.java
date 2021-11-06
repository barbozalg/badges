/**
 * @author barbozalg on Nov 5 2021.
 *
 * Write code to show how regular classes compare to inner classes, nested classes & anonymous classes.
 */

package com.barbozalg.classes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class ClassesApplication implements CommandLineRunner {

    static Logger loggerSLF4J = LoggerFactory.getLogger(com.barbozalg.classes.ClassesApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(com.barbozalg.classes.ClassesApplication.class, args);
    }

    @Override
    public void run(String... args){
        loggerSLF4J.info("*********************** Starting ClassesApplication ***********************");

        System.out.println("\nOuter class:");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();
        System.out.println(outerObject.outerClassVar);

        // error: 'outerClassPrivateVar' has private access
        // System.out.println((outerObject.outerClassPrivateVar);

        System.out.println(outerObject.staticOuterClassVar);

        // error: innerClassVar is scoped to the innerclass
        // System.out.println(outerObject.innerClassVar);

        // error: nestedClassVar, staticNestedClassVar are scoped to the nestedObject
        // System.out.println(outerObject.nestedClassVar);
        // System.out.println(outerObject.staticNestedClassVar);

        System.out.println("* classMembers:");
        outerObject.classMembers();

        System.out.println("\nInner class:");
        System.out.println("------------");
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        System.out.println(innerObject.innerClassVar);
        System.out.println("* classMembers:");
        innerObject.classMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        OuterClass.NestedClass staticNestedObject = new OuterClass.NestedClass();
        System.out.println(staticNestedObject.nestedClassVar);
        System.out.println(staticNestedObject.staticNestedClassVar);
        System.out.println("* classMembers:");
        staticNestedObject.classMembers(outerObject);

        System.out.println("\nAnonymous class:");
        System.out.println("----------------");
        LanguageTitle languageTitle = new LanguageTitle();
        languageTitle.returnTitle("Inner class");
        System.out.println("");
        languageTitle.returnTitle("Outer class");
        System.out.println("");
        languageTitle.returnTitle("Static nested class");
        System.out.println("");
        languageTitle.returnTitle("Anonymous class");
        System.out.println("");

        loggerSLF4J.info("*********************** Finishing ClassesApplication ***********************");
        System.exit(0);
    }


}
