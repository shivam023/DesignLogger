package com.shivams.logger;

import com.shivams.logger.enums.MessageType;
import com.shivams.logger.models.ConsoleLoggingPlatform;
import com.shivams.logger.service.Logger;

public class Driver {
    public static void main(String[] args) {
        Logger logger = new Logger();
        ConsoleLoggingPlatform cl = new ConsoleLoggingPlatform();
        logger.subscribe(MessageType.ERROR, cl);
        logger.subscribe(MessageType.GENERAL, cl);

        logger.setVal("Hi, this is a notification");

        logger.sendNotification(MessageType.ERROR);
    }
}