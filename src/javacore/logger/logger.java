package javacore.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class logger {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(logger.class.getName());
        logger.info("Duyy ơi, đây là thông báo INFO nè!");

        logger.severe("Lỗi to rồi bro!");

        logger.setLevel(Level.OFF);
        logger.fine("Giờ thì FINE mới hiện ra này.");
    }
}
