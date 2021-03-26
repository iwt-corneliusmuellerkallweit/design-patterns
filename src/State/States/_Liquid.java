package State.States;

import State.Chemicals.Chemical;

public class _Liquid implements State {
    Chemical chemical;

    public _Liquid(Chemical chemical) {
        this.chemical = chemical;
    }

    public void heat(int i) {
        int temperature = chemical.setTemperature(i);
        if (temperature >= chemical.getBoilingPoint()) {
            System.out.println("The " + chemical.getName() + " starts boiling. It becomes a gas.");
            chemical.setState(chemical.getGaseous());
        } else {
            System.out.println("The " + chemical.getName() + " heats up, but isn't boiling yet.");
        }
    }

    public void cool(int i) {
        int temperature = chemical.setTemperature(i*-1);
        if (temperature <= chemical.getFreezingPoint()) {
            System.out.println("The " + chemical.getName() + " starts freezing. It becomes a solid.");
            chemical.setState(chemical.getSolid());
        } else {
            System.out.println("The " + chemical.getName() + " cools down, but doesn't yet freeze.");
        }
    }
}
