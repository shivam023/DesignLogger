package com.shivams.logger.service;

import com.shivams.logger.enums.MessageType;

import java.util.HashMap;
import java.util.Map;

public class Logger extends LoggerServiceImpl {
    private Map<MessageType, Boolean> enabledEvents;

    public Logger() {
        enabledEvents = new HashMap<>();
        for(MessageType event: MessageType.values()) {
            enabledEvents.put(event, true);
        }
    }

    public void enableEvent(MessageType event) {
        enabledEvents.computeIfPresent(event, (key, value) -> true);
    }
    public void disableEvent(MessageType event) {
        enabledEvents.computeIfPresent(event, (key, value) -> false);
    }
}
