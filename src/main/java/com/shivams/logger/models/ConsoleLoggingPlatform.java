package com.shivams.logger.models;

public class ConsoleLoggingPlatform implements Consumer {
    public void update(String val) {
        System.out.println("Notification message: " + val);
    }
}
