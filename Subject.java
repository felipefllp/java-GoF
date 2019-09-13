package jogo;

import java.util.ArrayList;

public class Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifica() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update();
        }
    }
}
