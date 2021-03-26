package Decorator.Food;


public abstract class FoodItem {
    private String description = "No Description";
    private double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculatePrice() {
        return getPrice();
    }
}
