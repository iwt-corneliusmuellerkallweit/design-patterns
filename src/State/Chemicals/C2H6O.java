package State.Chemicals;

public class C2H6O extends Chemical {
    public C2H6O(int temperature) {
        super(temperature);
        setName("ethanol");
        setBoilingPoint(78);
        setFreezingPoint(-115);

        if (temperature >= getBoilingPoint()) {
            setState(getGaseous());
        } else if (temperature <= getFreezingPoint()) {
            setState(getSolid());
        } else {
            setState(getLiquid());
        }
    }
}
