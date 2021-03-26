package State.States;

import State.Chemicals.Chemical;

public class _Gaseous implements State {
    Chemical chemical;

    public _Gaseous(Chemical chemical) {
        this.chemical = chemical;
    }

    public void heat(int i) {
        int temperature = chemical.setTemperature(i);
        System.out.println("The " + chemical.getName() + " heats up even more and becomes more gaseous.");
    }

    public void cool(int i) {
        int temperature = chemical.setTemperature(i * -1);
        if (temperature <= chemical.getFreezingPoint()) {
            System.out.println("The " + chemical.getName() + " cools down so quickly that it deposits. It becomes a solid.");
            chemical.setState(chemical.getSolid());
        } else if (temperature < chemical.getBoilingPoint()) {
            System.out.println("The " + chemical.getName() + " cools down and starts condensating. It becomes a liquid.");
            chemical.setState(chemical.getLiquid());
        } else {
            System.out.println("The " + chemical.getName() + " cools down but doesn't yet become a liquid.");
        }
    }
}
