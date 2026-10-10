package com.yassine.obs;

/**
 * @author pc
 **/
public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
