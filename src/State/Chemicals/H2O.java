package State.Chemicals;

public class H2O extends Chemical {
    public H2O(int temperature) {
        super(temperature);
        setName("water");
        setBoilingPoint(100);
        setFreezingPoint(0);

        if (temperature >= getBoilingPoint()) {
            setState(getGaseous());
        } else if (temperature <= getFreezingPoint()) {
            setState(getSolid());
        } else {
            setState(getLiquid());
        }
    }
}
