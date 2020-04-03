package com.shivams.logger.service;

import com.shivams.logger.enums.MessageType;
import com.shivams.logger.models.Consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoggerServiceImpl implements LoggerService {
    String val = "";
    private List<Consumer> subscribers;
    private Map<MessageType, List<Consumer>> registryMap;

    LoggerServiceImpl() {
        registryMap = new HashMap<>();
        subscribers = new ArrayList<>();
    }

    @Override
    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public void subscribe(MessageType event, Consumer logger) {
        if(!subscribers.contains(logger)) {
            subscribers.add(logger);
        }
        if(!registryMap.containsKey(event)) {
            List<Consumer> newConsumer = new ArrayList<Consumer>();
            newConsumer.add(logger);
            registryMap.put(event, newConsumer);
        } else if(!registryMap.get(event).contains(logger)) {
            registryMap.get(event).add(logger);
        }
    }

    @Override
    public void unsubscribe(Consumer logger) {
        if(!subscribers.contains(logger)) {
            subscribers.remove(logger);
        }
        registryMap.entrySet().removeIf(entry -> (logger.equals(entry)));
    }

    @Override
    public void sendNotification(MessageType event) {
        List<Consumer> subscriberList = registryMap.get(event);
        for(Consumer sub : subscriberList) {
            sub.update(val);
        }
    }
}
