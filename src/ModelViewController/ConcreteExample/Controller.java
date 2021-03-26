package ModelViewController.ConcreteExample;

import java.io.IOException;

public class Controller implements ControllerInterface {
    RPGInterface rpg;
    CommandLine commandLine;

    public Controller(RPGInterface rpg) throws IOException {
        this.rpg = rpg;
        this.commandLine = new CommandLine(rpg, this);
        rpg.initialize();
    }

    public void read(String input) throws IOException {
        switch (input) {
            case "help" -> rpg.help();
            case "stop" -> rpg.stop();
            default -> rpg.nonsense();
        }
    }
}
