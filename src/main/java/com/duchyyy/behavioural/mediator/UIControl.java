package com.duchyyy.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    //dont use abstract without observer
    //protected DialogBox owner;

//    public UIControl(DialogBox owner) {
//        this.owner = owner;
//    }

    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler observer) {
        eventHandlers.add(observer);
    }
    protected void notifyEventHandlers() {
        for (EventHandler observer : eventHandlers)
            observer.handle();
    }
}
