package AbstractFactoryMethod;

import AbstractFactoryMethod.Markets.Market;
import AbstractFactoryMethod.Markets.Supermarket;
import AbstractFactoryMethod.Markets.VeganMarket;
import AbstractFactoryMethod.Products.Product;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        ArrayList<Market> markets = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        markets.add(new Supermarket());
        markets.add(new VeganMarket());

        for (Market market : markets) {
            products.add(market.createMeat());
            products.add(market.createMilk());
        }

        for (Product product : products) {
            System.out.println(product.getDescription());
        }
    }
}
