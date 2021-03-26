package Command._Variants.Simplified.Devices;


public class Window {
    private boolean open;

    public void open() {
        if (!open) {
            open = true;
            System.out.println("The window is opened.");
        }
    }

    public void close() {
        if (open) {
            open = false;
            System.out.println("The window is closed.");
        }
    }
}
