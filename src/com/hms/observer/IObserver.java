package com.hms.observer;

public interface IObserver<T> {
    public void update(T message);
}
