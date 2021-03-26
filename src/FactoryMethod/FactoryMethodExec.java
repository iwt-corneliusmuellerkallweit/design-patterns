package FactoryMethod;

import FactoryMethod.Bars.Bar;
import FactoryMethod.Bars.EnglishBar;
import FactoryMethod.Bars.GermanBar;

import java.util.ArrayList;

public class FactoryMethodExec {
    public static void main(String[] args) {
        go();
    }

    private static void go() {

        ArrayList<Bar> bars = new ArrayList<>();
        Bar englishBar = new EnglishBar();
        bars.add(englishBar);
        Bar germanBar = new GermanBar();
        bars.add(germanBar);

        System.out.println("Lasst uns bei den Bars ein wenig was bestellen!\n");
        for (Bar bar : bars) {
            bar.order("beer");
            bar.order("cola");
            bar.order("peanuts");
            System.out.println();
        }
    }
}
