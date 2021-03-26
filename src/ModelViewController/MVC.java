package ModelViewController;

public class MVC {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        ModelInterface model = new Model();
        ControllerInterface controller = new Controller(model);
    }
}
