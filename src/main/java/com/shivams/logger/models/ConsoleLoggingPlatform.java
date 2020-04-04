package com.shivams.logger.models;

import com.shivams.logger.enums.MessageType;

public class ConsoleLoggingPlatform implements Consumer {
    public void update(String val, MessageType event) {
        System.out.println(event.toString() + ": Notification message: " + val);
    }
}
