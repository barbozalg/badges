/**
 * @author barbozalg on Jun 23 2020.
 */

package barbozalg.total_characters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(TotalCharacters.class);

    private static final int STRING_LENGTH = 1024;
    private static final int MESSAGE_FREQUENCY = 1000;
    private static final int DEBUG_FREQUENCY = 10000;
    private static MemoryMXBean memoryMXbean = ManagementFactory.getMemoryMXBean();
    private static List<String> string_list = new LinkedList<>();

    private static String repeat(String chr) {
        return new String(new char[STRING_LENGTH]).replace("\0", chr);
    }

    public static void run() {
        int length;
        long usedMemory;
        long maxMemory = memoryMXbean.getHeapMemoryUsage().getMax();
        try {
            for (int i = 0; i < 30000000; i++) {
                string_list.add(repeat("A"));
                if (i % MESSAGE_FREQUENCY == 0) {
                    LOGGER.info("Current count: " + ANSI_CYAN + i + ANSI_WHITE);
                }
                if (i % DEBUG_FREQUENCY == 0) {
                    LOGGER.debug("Debug point at " + i);
                }
            }
        } catch (OutOfMemoryError e) {
            usedMemory = memoryMXbean.getHeapMemoryUsage().getUsed();
            length = string_list.size();
            string_list.clear();
            String msg = "\nOut of memory error" + ANSI_WHITE + ", usedMemory=" + ANSI_YELLOW + usedMemory;
            LOGGER.error(ANSI_RED + msg + ANSI_WHITE + ", maxMemory=" + ANSI_CYAN + maxMemory + ANSI_WHITE);
            LOGGER.error("Strings in the list: " + ANSI_BLUE + length + ANSI_WHITE);
            LOGGER.error("Chars in the list: " + ANSI_BLUE + (length * STRING_LENGTH) + ANSI_WHITE);
            LOGGER.error("Bytes of memory per String: " + ANSI_BLUE + (usedMemory / length) + ANSI_WHITE);
            LOGGER.error("Bytes of memory per Char: " + ANSI_BLUE + (usedMemory / (length * STRING_LENGTH)) + ANSI_WHITE);
        } finally {
            string_list.clear();
        }
    }

}
