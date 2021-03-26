package ModelViewController;

public interface ModelInterface {
    void initialize();

    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
