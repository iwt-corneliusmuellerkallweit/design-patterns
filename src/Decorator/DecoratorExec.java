package Decorator;

import Decorator.Condiments.DecoratorCheese;
import Decorator.Condiments.DecoratorMustard;
import Decorator.Condiments.DecoratorPickles;
import Decorator.Food.FoodItem;
import Decorator.Food.FoodItemBurger;
import Decorator.Food.FoodItemHotdog;

public class DecoratorExec {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        FoodItem burger = new FoodItemBurger();
        System.out.println(burger.getDescription() + ", " + burger.calculatePrice() + "$");

        FoodItem hotdog = new FoodItemHotdog();
        hotdog = new DecoratorCheese(hotdog);
        hotdog = new DecoratorMustard(hotdog);
        hotdog = new DecoratorPickles(hotdog);

        System.out.println(hotdog.getDescription() + ", " + hotdog.calculatePrice() + "$");
    }
}
