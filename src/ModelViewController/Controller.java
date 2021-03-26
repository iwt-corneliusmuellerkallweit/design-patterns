package ModelViewController;

public class Controller implements ControllerInterface {
    ModelInterface model;
    View view;

    public Controller(ModelInterface model) {
        this.model = model;
        this.view = new View(model, this);
        model.initialize();
        System.out.println("Controller initialized.");
    }
}
