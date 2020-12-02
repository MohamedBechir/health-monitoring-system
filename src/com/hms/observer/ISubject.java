package com.hms.observer;

public interface ISubject<T> {
    public void attach(IObserver<T> o);
    public void detach(IObserver<T> o);
    public void notifyObservers();
}
