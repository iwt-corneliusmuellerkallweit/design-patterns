package ModelViewController;

import java.util.ArrayList;

public class Model implements ModelInterface {
    ArrayList<Observer> observers = new ArrayList<>();

    public void initialize() {
        System.out.println("RPG initialized.");
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
