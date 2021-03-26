package Command._Variants.Simplified;

import Command._Variants.Simplified.Devices.Lightbulb;
import Command._Variants.Simplified.Devices.Table;
import Command._Variants.Simplified.Devices.Window;

public class User {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        Remote remote = new Remote(3);

        Window window = new Window();
        Table table = new Table();
        Lightbulb lightbulb = new Lightbulb();

        remote.setButtons(0, window::open, window::close);
        remote.setButtons(1, table::startClean, table::stopClean);
        remote.setButtons(2, lightbulb::turnOn, lightbulb::turnOff);


        remote.onButtonPressed(0);
        remote.offButtonPressed(0);

        System.out.println();

        remote.onButtonPressed(1);
        remote.offButtonPressed(1);

        System.out.println();

        remote.onButtonPressed(2);
        remote.onButtonPressed(2);
        remote.onButtonPressed(2);
        remote.onButtonPressed(2);
        remote.offButtonPressed(2);
    }
}
