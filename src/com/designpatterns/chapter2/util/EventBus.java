package com.designpatterns.chapter2.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 */
public class EventBus {

    private List<Observer> observers = new ArrayList<>();

    public void notifyStateChanged() {
        observers.stream().findAny().get().notifyStateChanged();
    }

    public void subscribe(Observer o) {
        observers.add(o);
    }

    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

}
