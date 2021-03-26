package ModelViewController.ConcreteExample;

import java.io.IOException;

public interface Observer {
    void update(String message) throws IOException;
}
