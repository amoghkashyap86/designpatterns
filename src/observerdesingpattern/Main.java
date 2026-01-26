package designpatterns.src.observerdesingpattern;

public class Main {
    public static void main(String[] args) {
        CricketScoreObservable cricketScoreObservable = new CricketScoreObservable();
        Observer jioHostStatObserver = new JioHotstarObserver((CricketScoreObservable) cricketScoreObservable);
        Observer CrickBuzzObserver = new CrickBuzzObserver((CricketScoreObservable) cricketScoreObservable);

        cricketScoreObservable.addObserver(CrickBuzzObserver);
        cricketScoreObservable.addObserver(jioHostStatObserver);

        cricketScoreObservable.setCurrentScore(20);

    }
}
