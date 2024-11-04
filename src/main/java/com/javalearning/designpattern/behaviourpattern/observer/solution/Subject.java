package com.javalearning.designpattern.behaviourpattern.observer.solution;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObserver();
}
