package ModelViewController.ConcreteExample;

import java.io.IOException;
import java.util.ArrayList;

public class RPG implements RPGInterface {
    ArrayList<Observer> observers = new ArrayList<>();

    public void initialize() throws IOException {
        notifyObservers("\nWELCOME TO MVC-TOPIA!!\n<><><><><><><><><><><>\n");
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) throws IOException {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void help() throws IOException {
        notifyObservers("There is nothing you can do. Type stop to end the game.");
    }

    public void stop() {
        System.exit(0);
    }

    public void nonsense() throws IOException {
        notifyObservers("I didn't understand that. Try typing 'help' for a list of available commands.");
    }
}
