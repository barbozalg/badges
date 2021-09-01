/**
 * @author barbozalg on Feb 5 2021.
 */

package com.barbozalg.classdesign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


class ExternalClass {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED =  "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    static Logger loggerSLF4J = LoggerFactory.getLogger(ClassDesignApplication.class);
    static ch.qos.logback.classic.Logger loggerLogback = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(ClassDesignApplication.class);

    public void outPut(String msg) {
        loggerSLF4J.info(ANSI_RED + "Message from ExternalClass using loggerSLF4J: {}" + ANSI_RESET, msg);
    }

    // Static class
    public static class InternalStaticClass {

        public void printMessage(String msg) {
            loggerSLF4J.info(ANSI_RED + "Message from InternalStaticClass using loggerSLF4J: {}" + ANSI_RESET, msg);
        }

    }

    // Non-static class
    public class InternalPublicClass {

        public void display(String msg){
            loggerSLF4J.info(ANSI_RED + "Message from InternalPublicClass using loggerSLF4J: {}" + ANSI_RESET, msg);
        }

    }
}


class ModifyOutPutMethodClass extends ExternalClass {

    public void outPut(String msg) {
        loggerLogback.info(ANSI_BLUE + "Message from ModifyOutPutClass using loggerLogback: {}" + ANSI_RESET, msg);
    }

}

class ModifyPrintMessageMethodClass extends ExternalClass {

    public static class InternalStaticClass {

        public void printMessage(String msg) {
            loggerLogback.info(ANSI_BLUE + "Message from ModifyInternalStaticClass using loggerLogback: {}" + ANSI_RESET, msg);
        }

    }

}

class ModifyDisplayMethodClass extends ExternalClass {

    public class InternalPublicClass {

        public void display(String msg){
            loggerLogback.info(ANSI_BLUE + "Message from ModifyDisplayClass using loggerLogback: {}" + ANSI_RESET, msg);
        }

    }

}
