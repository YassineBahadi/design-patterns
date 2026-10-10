package com.yassine.obs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pc
 **/
public class ObservableImpl implements Observable {
    private List<Observer> observers=new ArrayList<>();
    private int state;

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(state);
        }
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState(){
        return state;
    }
}
