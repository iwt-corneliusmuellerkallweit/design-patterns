package ModelViewController.ConcreteExample;

import java.io.IOException;

public interface RPGInterface {
    void initialize() throws IOException;

    void registerObserver(Observer observer);
    void notifyObservers(String message) throws IOException;
    void removeObserver(Observer observer);

    void help() throws IOException;

    void stop();

    void nonsense() throws IOException;
}
