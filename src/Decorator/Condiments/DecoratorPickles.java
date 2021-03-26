package Decorator.Condiments;

import Decorator.Food.FoodItem;

public class DecoratorPickles extends FoodItemDecorator {
    FoodItem foodItem;

    public DecoratorPickles(FoodItem foodItem) {
        this.foodItem = foodItem;
        setPrice(0.5);
    }

    public String getDescription() {
        return foodItem.getDescription() + ", Pickles";
    }

    public double calculatePrice() {
        return foodItem.calculatePrice() + getPrice();
    }
}
