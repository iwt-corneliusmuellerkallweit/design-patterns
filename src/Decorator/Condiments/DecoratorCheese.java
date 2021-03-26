package Decorator.Condiments;

import Decorator.Food.FoodItem;

public class DecoratorCheese extends FoodItemDecorator {
    FoodItem foodItem;

    public DecoratorCheese(FoodItem foodItem) {
        this.foodItem = foodItem;
        setPrice(1);
    }

    public String getDescription() {
        return foodItem.getDescription() + ", Cheese";
    }

    public double calculatePrice() {
        return foodItem.calculatePrice() + getPrice();
    }
}
