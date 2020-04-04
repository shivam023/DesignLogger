Logger:

This logger design supports 3 different types of events:

1. ERROR
2. GENERAL
3. WARNING

It has been designed keeping in mind the producer and consumer design pattern.

Currently two logging frameworks are subscribed to this logger to update the logs:

Console Logging and File logging which can further be expanded easily.

To run:

Simply run the Driver class