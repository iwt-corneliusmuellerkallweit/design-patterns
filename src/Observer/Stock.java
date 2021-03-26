package Observer;

import java.util.ArrayList;

public class Stock implements Subject {
    private final ArrayList<Observer> observers;
    private final String name;
    private double value;

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        ArrayList<Stock> stock = new ArrayList<>();
        stock.add(this);
        for (Observer observer : observers) {
            observer.update(stock);
        }
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
        notifyObservers();
    }

    public Stock(String name, double value) {
        this.name = name;
        this.value = value;
        this.observers = new ArrayList<>();
    }
}
