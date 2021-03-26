package ModelViewController;

public class View implements Observer {
    private final ModelInterface model;
    private final ControllerInterface controller;

    public View(ModelInterface model, ControllerInterface controller) {
        this.model = model;
        this.controller = controller;
        model.registerObserver(this);
        initialize();
    }

    public void update() {
        System.out.println("The view has been updated.");
    }

    private void initialize() {
        System.out.println("CommandLine initialized.");
    }
}
