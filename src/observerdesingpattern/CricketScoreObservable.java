package designpatterns.src.observerdesingpattern;

import java.util.ArrayList;
import java.util.List;

public class CricketScoreObservable implements Observable {

    private List<Observer> observers;

    private int currentScore;

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
        update();
    }

    public CricketScoreObservable() {
        this.observers = new ArrayList<>();
        this.currentScore = 0;
    }

    @Override
    public boolean addObserver(Observer observer) {
        return this.observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        return this.observers.remove(observer);
    }

    @Override
    public void update() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

}
