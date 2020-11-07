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
                    LOGGER.info(String.format("Current count: %,d", i));
                }
                if ((i % DEBUG_FREQUENCY == 0) && (i != 0)){
                    LOGGER.debug(String.format("Debug point at %,d", i));
                }
                if ((i % WARN_FREQUENCY == 0) && (i != 0)){
                    LOGGER.warn(String.format("Warn point at %,d", i));
                }
            }
        } catch (OutOfMemoryError e) {
            usedMemory = memoryMXbean.getHeapMemoryUsage().getUsed();
            length = string_list.size();
            string_list.clear();
            String msg = String.format(
                "\nOut of memory error, usedMemory=%,d, maxMemory=%,d" +
                "\nStrings in the list: %,d" +
                "\nChars in the list: %,d" +
                "\nBytes of memory per String: %,d" +
                "\nBytes of memory per Char: %,d",
                usedMemory, maxMemory, length, (length * STRING_LENGTH),
                (usedMemory / length), (usedMemory / (length * STRING_LENGTH))
            );
            LOGGER.error(msg);
        } finally {
            string_list.clear();
        }
    }

}
