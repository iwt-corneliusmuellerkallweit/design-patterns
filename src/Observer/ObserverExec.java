package Observer;

import java.util.ArrayList;

public class ObserverExec {

    public static void main(String[] args) {
        go();
    }

    private static void go() {
        Stockmarket stockmarket = new Stockmarket();

        Stock amazon = new Stock("amazon", 100);
        Stock bemazon = new Stock("bemazon", 100);
        Stock cemazon = new Stock("cemazon", 100);
        Stock demazon = new Stock("demazon", 100);

        amazon.registerObserver(stockmarket);
        bemazon.registerObserver(stockmarket);
        cemazon.registerObserver(stockmarket);
        demazon.registerObserver(stockmarket);

        ArrayList<Stock> stocks = new ArrayList<>();
        stocks.add(amazon);
        stocks.add(bemazon);
        stocks.add(cemazon);
        stocks.add(demazon);
        stockmarket.setStocks(stocks);

        StockWatch stockwatch = new StockWatch();
        stockmarket.registerObserver(stockwatch);

        amazon.setValue(amazon.getValue() + 2 - Math.random()*4);
        bemazon.setValue(amazon.getValue() + 2 - Math.random()*4);
        cemazon.setValue(amazon.getValue() + 2 - Math.random()*4);
        demazon.setValue(amazon.getValue() + 2 - Math.random()*4);
    }
}
