package ModelViewController.ConcreteExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLine implements Observer {
    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    private final ControllerInterface controller;

    public CommandLine(RPGInterface rpg, ControllerInterface controller) {
        this.controller = controller;
        rpg.registerObserver(this);
        initialize();
    }

    public void update(String message) throws IOException {
        System.out.println(message);
        ask();
    }

    private void initialize() {
    }

    private void ask() throws IOException {
        System.out.print("What do you want to do next?\n? ");
        controller.read(reader.readLine());
    }
}
