package Facade;

import Facade.Kitchen.Fridge;
import Facade.Kitchen.Mixer;
import Facade.Kitchen.Oven;
import Facade.Kitchen.Cabinet;

import java.util.ArrayList;

public class Facade {
    Cabinet utensilCabinet;
    Cabinet foodCabinet;
    Fridge fridge;
    Mixer mixer;
    Oven oven;

    public Facade(Cabinet utensilCabinet, Cabinet foodCabinet, Fridge fridge, Mixer mixer, Oven oven) {
        this.utensilCabinet = utensilCabinet;
        this.foodCabinet = foodCabinet;
        this.fridge = fridge;
        this.mixer = mixer;
        this.oven = oven;
    }

    public void makeCake(String flavor) {
        ArrayList<String> fridgeIngredients = new ArrayList<>();
        fridgeIngredients.add("milk");
        fridgeIngredients.add("butter");
        fridgeIngredients.add("5 eggs");

        fridge.open();
        fridge.take(fridgeIngredients);
        fridge.close();

        ArrayList<String> foodCabinetIngredients = new ArrayList<>();
        foodCabinetIngredients.add("sugar");
        foodCabinetIngredients.add("vanilla sugar");
        foodCabinetIngredients.add("salt");
        foodCabinetIngredients.add("flour");
        foodCabinetIngredients.add("cocoa");
        foodCabinetIngredients.add("baking powder");
        foodCabinetIngredients.add("choclate flakes");

        foodCabinet.open();
        foodCabinet.take(foodCabinetIngredients);
        foodCabinet.close();

        utensilCabinet.open();
        utensilCabinet.getBowl();
        utensilCabinet.close();
        putInBowl();
        mixer.mixUp();

        oven.heatUp(180);

        utensilCabinet.getBakingPan();
        fillIntoPan();

        oven.open();
        oven.insert("baking pan");
        oven.close();

        System.out.println("Now we wait for 40 minutes.");

        oven.open();
        oven.turnOff();
        oven.takeOut("baking pan");
        oven.close();

        System.out.println("The cake must cool for 90 minutes.");
        System.out.println("Everything is cleaned up.");
        System.out.println("You have successfully baked a " + flavor + " cake!");
    }

    public void cleanKitchen() {
        oven.heatUp(50);

        foodCabinet.open();
        foodCabinet.empty();
        foodCabinet.clean();
        foodCabinet.refill();
        foodCabinet.close();

        oven.turnOff();
        oven.open();

        utensilCabinet.open();
        utensilCabinet.empty();
        utensilCabinet.clean();
        utensilCabinet.refill();
        utensilCabinet.close();

        oven.sprayWithCleaner();

        fridge.open();
        fridge.empty();
        fridge.defrost();
        fridge.clean();
        fridge.refill();
        fridge.close();

        mixer.disassemble();
        mixer.cleanParts();
        mixer.reassemble();

        oven.clean();
        oven.close();
    }

    private void putInBowl() {
        System.out.println("Everything is put in a bowl.");
    }

    private void fillIntoPan() {
        System.out.println("Everything is filled into the pan.");
    }
}
