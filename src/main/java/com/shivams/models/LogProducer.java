package com.shivams.models;

import java.util.ArrayList;
import java.util.List;

public class LogProducer implements Producer{

    private List<Consumer> subscribers = new ArrayList<Consumer>();
    @Override
    public void subscribe(Consumer logger) {
        if(!subscribers.contains(logger))
            subscribers.add(logger);
    }

    @Override
    public void unsubscribe(Consumer logger) {
        if(!subscribers.contains(logger))
            subscribers.remove(logger);
    }

    @Override
    public void sendNotification(Consumer logger) {
        logger.update();
    }
}
