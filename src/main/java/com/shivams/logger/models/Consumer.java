package com.shivams.logger.models;

import com.shivams.logger.enums.MessageType;

public interface Consumer {
    void update(String val, MessageType event);
}
