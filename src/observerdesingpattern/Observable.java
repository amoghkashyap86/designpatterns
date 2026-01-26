package designpatterns.src.observerdesingpattern;

public interface Observable {

    boolean addObserver(Observer observer);

    boolean removeObserver(Observer observer);

    void update();

}
