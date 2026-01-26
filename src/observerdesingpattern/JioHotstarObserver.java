package designpatterns.src.observerdesingpattern;

public class JioHotstarObserver implements Observer {

    private CricketScoreObservable scoreObservable;

    public JioHotstarObserver(CricketScoreObservable cricketScoreObservable) {
        this.scoreObservable = cricketScoreObservable;
    }

    @Override
    public void update() {
        System.out.println("cricket score has been updated for JioHotstatObserver" + scoreObservable.getCurrentScore());
    }

}
