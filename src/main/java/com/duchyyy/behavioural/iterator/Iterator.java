package com.duchyyy.behavioural.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
