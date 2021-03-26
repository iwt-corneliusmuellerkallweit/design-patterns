package Observer;

import java.util.ArrayList;

public class StockWatch implements Observer {
    ArrayList<Stock> stocks;

    public void update(ArrayList<Stock> newStocks) {
        stocks = newStocks;
        display();
    }

    public StockWatch() {
        stocks = new ArrayList<>();
    }

    public void display() {
        System.out.println();
        for (Stock stock : stocks) {
            System.out.println(stock.getName() + ": " + stock.getValue() + "$US.");
        }
    }
}
