package designpatterns.src.observerdesingpattern;

public class CrickBuzzObserver implements Observer {

    private CricketScoreObservable scoreObservable;

    public CrickBuzzObserver(CricketScoreObservable cricketScoreObservable) {
        this.scoreObservable = cricketScoreObservable;
    }

    @Override
    public void update() {
        System.out.println("cricket score has been updated for crickbuzz " + scoreObservable.getCurrentScore());
    }

}
