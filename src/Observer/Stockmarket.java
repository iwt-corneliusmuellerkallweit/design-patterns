package Observer;

import java.util.ArrayList;

public class Stockmarket implements Subject, Observer {
    private ArrayList<Observer> observers;
    private ArrayList<Stock> stocks;

    public Stockmarket() {
        observers = new ArrayList<>();
        stocks = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stocks);
        }
    }

    public void update(ArrayList<Stock> newStock) {
        int i = -1;
        for (Stock stock : stocks) {
            if (newStock.get(0).getName().equals(stock.getName())) {
                i = stocks.indexOf(stock);
            }
        }
        if (i > -1) {
            stocks.remove(i);
            stocks.add(newStock.get(0));
        }
        notifyObservers();
    }

    public ArrayList<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }
}
