package org.example.collectionFrame.secondExample;

public class Apple {
    private static long counter = 1;
    private final long id = counter++;

    public long getId() {
        return this.id;
    }
}
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Braeburn extends Apple{}
