package com.shivams.logger.service;

import com.shivams.logger.enums.MessageType;
import com.shivams.logger.models.Consumer;

public interface LoggerService {
    void subscribe(MessageType event, Consumer s);
    void sendNotification(MessageType s);
    void unsubscribe(Consumer s);
    void setVal(String val);
}
