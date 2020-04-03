package com.shivams.logger;

import com.shivams.logger.enums.MessageType;
import com.shivams.logger.models.ConsoleLogger;
import com.shivams.logger.service.Logger;

public class Driver {
    public static void main(String[] args) {
        Logger logger = new Logger();
        ConsoleLogger cl = new ConsoleLogger();
        logger.subscribe(MessageType.ERROR, cl);
    }
}