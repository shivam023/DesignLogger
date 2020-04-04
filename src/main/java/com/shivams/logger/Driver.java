package com.shivams.logger;

import com.shivams.logger.enums.MessageType;
import com.shivams.logger.models.ConsoleLoggingPlatform;
import com.shivams.logger.models.FileLoggingPlatform;
import com.shivams.logger.service.Logger;

public class Driver {
    public static void main(String[] args) {
        Logger logger = new Logger();
        ConsoleLoggingPlatform cl = new ConsoleLoggingPlatform();
        FileLoggingPlatform fl = new FileLoggingPlatform();
        logger.subscribe(MessageType.ERROR, cl);
        logger.subscribe(MessageType.GENERAL, cl);
        logger.subscribe(MessageType.ERROR, fl);

        logger.setVal("dummy");

        logger.sendNotification(MessageType.ERROR);
    }
}