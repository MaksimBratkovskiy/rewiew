package org.example.collectionFrame.secondExample;

public class Orange {
    private static long counter = 1;
    private final long id = counter++;

    public long getId() {
        return this.id;
    }
}
