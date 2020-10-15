/**
 * @author barbozalg on Jun 23 2020.
 */

package com.barbozalg.totalcharacters;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.util.LinkedList;
import java.util.List;


public class TotalCharacters {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private static final Logger LOGGER = Logger.getLogger(TotalCharacters.class);

    private static final int STRING_LENGTH = 1024;
    private static final int MESSAGE_FREQUENCY = 1000;
    private static final int DEBUG_FREQUENCY = 10000;
    private static final int WARN_FREQUENCY = 100000;
    private static MemoryMXBean memoryMXbean = ManagementFactory.getMemoryMXBean();
    private static List<String> string_list = new LinkedList<>();

    private static String repeat(String chr) {
        return new String(new char[STRING_LENGTH]).replace("\0", chr);
    }

    public static void run() {
        int length;
        long usedMemory;
        long maxMemory = memoryMXbean.getHeapMemoryUsage().getMax();

        //PropertiesConfigurator is used to configure logger from properties file
        PropertyConfigurator.configure("log4j.properties");

        //Log in console in and log file
        LOGGER.debug("Log4j appender configuration is successful !!");

        try {
            for (int i = 0; i < 30000000; i++) {
                string_list.add(repeat("A"));
                if (i % MESSAGE_FREQUENCY == 0) {
                    LOGGER.info("Current count: " + ANSI_CYAN + i + ANSI_WHITE);
                }
                if ((i % DEBUG_FREQUENCY == 0) && (i != 0)){
                    LOGGER.debug("Debug point at " + ANSI_BLUE + i + ANSI_WHITE);
                }
                if ((i % WARN_FREQUENCY == 0) && (i != 0)){
                    LOGGER.warn("Warn point at " + ANSI_YELLOW + i + ANSI_WHITE);
                }
            }
        } catch (OutOfMemoryError e) {
            usedMemory = memoryMXbean.getHeapMemoryUsage().getUsed();
            length = string_list.size();
            string_list.clear();
            String msg = ANSI_RED + "\nOut of memory error" + ANSI_WHITE + ", usedMemory=" + ANSI_YELLOW;
            msg += usedMemory + ANSI_WHITE + ", maxMemory=" + ANSI_CYAN + maxMemory + ANSI_WHITE;
            msg += "\nStrings in the list: " + ANSI_BLUE + length + ANSI_WHITE + "\nChars in the list: ";
            msg += ANSI_BLUE + (length * STRING_LENGTH) + ANSI_WHITE + "\nBytes of memory per String: ";
            msg += ANSI_BLUE + (usedMemory / length) + ANSI_WHITE + "\nBytes of memory per Char: ";
            msg += ANSI_BLUE + (usedMemory / (length * STRING_LENGTH)) + ANSI_WHITE;
            LOGGER.error(msg);
        } finally {
            string_list.clear();
        }
    }

}
