/**
 * @author barbozalg on Feb 5 2021.
 *
 * Show proper use of the static and final in a class.
 */

package com.barbozalg.classdesign;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


@SpringBootApplication
public class ClassDesignApplication implements CommandLineRunner {

    static Logger loggerSLF4J = LoggerFactory.getLogger(ClassDesignApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ClassDesignApplication.class, args);
    }

    @Override
    public void run(String... args){
        loggerSLF4J.info("*********************** Starting ClassDesignApplication ***********************");

//        staticAndFinalClasses();
//        extendingStaticAndFinalClasses();
//        inmutableDataValueType();
        overrideHashCodeEquals();

        loggerSLF4J.info("*********************** Finishing ClassDesignApplication ***********************");
        System.exit(0);
    }

    private void overrideHashCodeEquals() {
        OverrideHashCodeAndEquals classBeingTested = new OverrideHashCodeAndEquals();
        ClassToBeOverridden one = new ClassToBeOverridden(1);
        ClassToBeOverridden two = new ClassToBeOverridden(1);
        ClassToBeOverridden three = new ClassToBeOverridden(1);
        messageHelper(false, classBeingTested, one, two, three);

        one = new ClassToBeOverridden(1);
        two = new ClassToBeOverridden(5);
        three = new ClassToBeOverridden(5);
        messageHelper(true, classBeingTested, one, two, three);

        one = new ClassToBeOverridden(1);
        two = new ClassToBeOverridden(12);
        three = new ClassToBeOverridden(12);
        messageHelper(true, classBeingTested, one, two, three);
    }

    private void messageHelper(boolean firstLine, OverrideHashCodeAndEquals classBeingTested, ClassToBeOverridden one, ClassToBeOverridden two, ClassToBeOverridden three) {
        if (firstLine) {
            loggerSLF4J.info("----------------------------------------");
        }
        loggerSLF4J.info("VALUES:");
        loggerSLF4J.info("one = " + one.getValue());
        loggerSLF4J.info("two = " + two.getValue());
        loggerSLF4J.info("three = " + three.getValue());
        loggerSLF4J.info(classBeingTested.evalEqualsMethod(one, two));
        loggerSLF4J.info(classBeingTested.evalHashCodeMethod(one, three));
    }

    private void inmutableDataValueType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nHow many times do you want to repeat the message? [default value 1] (values from 1 to 10):");
        String input = scanner.nextLine();
        int times = 1;
        try{
            times = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Wrong value entered. Using 1 [default value]");
        }
        FinalClass finalSample = new FinalClass(times);
        loggerSLF4J.info("Next message it will be printed {}", times);
        finalSample.display("Sent by finalSample.display");
    }

    private void extendingStaticAndFinalClasses() {
        // Calling a method from ModifyOutPutMethodClass which extends ExternalClass
        ModifyOutPutMethodClass otherExternal = new ModifyOutPutMethodClass();
        otherExternal.outPut("5- Sent by other.outPut");

        // Calling a method from InternalStaticClass in ModifyPrintMessageMethodClass which extends ExternalClass
        ModifyPrintMessageMethodClass.InternalStaticClass otherPrinter = new ModifyPrintMessageMethodClass.InternalStaticClass();
        otherPrinter.printMessage("6- Sent by otherPrinter.printMessage");

        // Calling a method from InternalPublicClass in ModifyDisplayMethodClass which extends ExternalClass
        ModifyDisplayMethodClass.InternalPublicClass otherInnerObject = new ModifyDisplayMethodClass().new InternalPublicClass();
        otherInnerObject.display("7- Sent by otherInnerObject.display");

        // Calling a method from InternalPublicClass in ModifyDisplayMethodClass using a variable declared
        // as ModifyDisplayMethodClass which extends ExternalClass
        ModifyDisplayMethodClass anotherExternal = new ModifyDisplayMethodClass();
        ModifyDisplayMethodClass.InternalPublicClass otherInner = anotherExternal.new InternalPublicClass();
        otherInner.display("8- Sent by otherInner.display");
    }

    private void staticAndFinalClasses() {
        // Calling a method from ExternalClass
        ExternalClass external = new ExternalClass();
        external.outPut("1- Sent by external.outPut");

        // Calling a method from InternalStaticClass in ExternalClass
        ExternalClass.InternalStaticClass printer = new ExternalClass.InternalStaticClass();
        printer.printMessage("2- Sent by printer.printMessage");

        // Calling a method from InternalPublicClass in ExternalClass
        ExternalClass.InternalPublicClass innerObject = new ExternalClass().new InternalPublicClass();
        innerObject.display("3- Sent by innerObject.display");

        // Calling a method from InternalPublicClass in ExternalClass using a variable declared as ExternalClass
        ExternalClass.InternalPublicClass inner = external.new InternalPublicClass();
        inner.display("4- Sent by inner.display");
    }

}
