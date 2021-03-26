package Decorator.Condiments;

import Decorator.Food.FoodItem;

public class DecoratorMustard extends FoodItemDecorator {
    FoodItem foodItem;

    public DecoratorMustard(FoodItem foodItem) {
        this.foodItem = foodItem;
        setPrice(0.2);
    }

    public String getDescription() {
        return foodItem.getDescription() + ", Mustard";
    }

    public double calculatePrice() {
        return foodItem.calculatePrice() + getPrice();
    }
}
