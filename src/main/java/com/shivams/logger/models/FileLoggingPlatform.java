package com.shivams.logger.models;

import com.shivams.logger.enums.MessageType;

import java.io.FileWriter;
import java.io.IOException;

public class FileLoggingPlatform implements Consumer {
    private static final String filePath = "src/main/java/com/shivams/logger/models/";
    @Override
    public void update(String val, MessageType event) {
        // print to a file
        try {
            FileWriter myWriter = new FileWriter(filePath + "FileLog.txt");
            myWriter.write(event.toString() + ": " + "The " +  val + " is not present");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
