package patterns.observer.example1.model;

import patterns.observer.example1.interfaces.Observer;
import patterns.observer.example1.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {

    private List<Observer> observers;
    private String message;

    public EmailTopic() {
        this.observers = new ArrayList<Observer>();
    }

    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null object/Observer");
        
        if (!observers.contains(observer))
            observers.add(observer);
    }

    public void unregister(Observer observer) {
        System.out.println("The " + observer + " is unregister!");
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer :
                observers) {
            observer.update();
        }
    }

    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("Message posted to my topic: " + msg);
        this.message = msg;
        notifyObservers();
    }
}
