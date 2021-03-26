package State;

import State.Chemicals.C2H6O;
import State.Chemicals.H2O;

public class StateExec {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        System.out.println("Let us create some water and change it's state:");
        H2O water = new H2O(20);
        water.heat(100);
        water.cool(200);
        water.heat(120);

        System.out.println("\nNow, let's create some ethanol:");
        C2H6O ethanol = new C2H6O(20);
        ethanol.cool(50);
        ethanol.heat(120);
        ethanol.cool(200);
        ethanol.cool(20);
    }
}
