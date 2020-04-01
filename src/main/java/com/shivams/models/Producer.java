package com.shivams.models;

public interface Producer {

    void subscribe(Consumer s);
    void sendNotification(Consumer s);
    void unsubscribe(Consumer s);
    //void setVal(String val);
}
