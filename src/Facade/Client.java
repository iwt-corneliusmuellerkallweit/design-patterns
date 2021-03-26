package Facade;

import Facade.Kitchen.Fridge;
import Facade.Kitchen.Mixer;
import Facade.Kitchen.Oven;
import Facade.Kitchen.Cabinet;

public class Client {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        Facade facade = new Facade(new Cabinet("utensil cabinet"), new Cabinet("food cabinet"), new Fridge("fridge"), new Mixer(), new Oven());

        facade.makeCake("choclate");
        System.out.println();
        facade.cleanKitchen();
    }
}
