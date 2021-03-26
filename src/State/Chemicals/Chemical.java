package State.Chemicals;

import State.States.State;
import State.States._Gaseous;
import State.States._Liquid;
import State.States._Solid;

public abstract class Chemical {
    private final State gaseous;
    private final State liquid;
    private final State solid;

    private int boilingPoint;
    private int freezingPoint;

    private String name;

    private State state;
    private int temperature;


    public Chemical(int temperature) {
        this.gaseous = new _Gaseous(this);
        this.liquid = new _Liquid(this);
        this.solid = new _Solid(this);
        this.temperature = temperature;
        System.out.println("Temperature: " + setTemperature(0) + "°C");
    }

    public void heat(int i) {
        state.heat(i);
        System.out.println("Temperature: " + setTemperature(0) + "°C");
    }

    public void cool(int i) {
        state.cool(i);
        System.out.println("Temperature: " + setTemperature(0) + "°C");
    }

    public void setState(State state) {
        this.state = state;
    }

    public int setTemperature(int i) {
        temperature += i;
        return temperature;
    }

    public int getBoilingPoint() {
        return boilingPoint;
    }

    public int getFreezingPoint() {
        return freezingPoint;
    }

    public State getGaseous() {
        return gaseous;
    }

    public State getLiquid() {
        return liquid;
    }

    public State getSolid() {
        return solid;
    }

    public void setBoilingPoint(int boilingPoint) {
        this.boilingPoint = boilingPoint;
    }

    public void setFreezingPoint(int freezingPoint) {
        this.freezingPoint = freezingPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
