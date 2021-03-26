package ModelViewController.ConcreteExample;

import java.io.IOException;

public class MVC {
    public static void main(String[] args) throws IOException {
        go();
    }

    private static void go() throws IOException {
        RPGInterface model = new RPG();
        ControllerInterface controller = new Controller(model);
    }
}
