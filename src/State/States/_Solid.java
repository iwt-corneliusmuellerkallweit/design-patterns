package State.States;


import State.Chemicals.Chemical;

public class _Solid implements State {
    Chemical chemical;

    public _Solid(Chemical chemical) {
        this.chemical = chemical;
    }

    public void heat(int i) {
        int temperature = chemical.setTemperature(i);
        if (temperature >= chemical.getBoilingPoint()) {
            System.out.println("The " + chemical.getName() + " becomes hot so quickly that it sublimates. It becomes a gas.");
            chemical.setState(chemical.getGaseous());
        } else if (temperature > chemical.getFreezingPoint()) {
            System.out.println("The " + chemical.getName() + " heats up and melts. It becomes a liquid.");
            chemical.setState(chemical.getLiquid());
        } else {
            System.out.println("The " + chemical.getName() + " heats up a bit but is still a solid.");
        }
    }

    public void cool(int i) {
        int temperature = chemical.setTemperature(i*-1);
        System.out.println("The " + chemical.getName() + " becomes even cooler and more solid.");
    }
}
