package Singleton.Eager;

public class EagerWindowManager {
    private static final EagerWindowManager eagerWindowManager = new EagerWindowManager();

    private EagerWindowManager(){
        System.out.println("The unique window manager is created.");
    }

    public static EagerWindowManager getWindowManager() {
        return eagerWindowManager;
    }

    public void openWindow() {
        System.out.println("A new window is opened.");
    }

    public void closeWindow() {
        System.out.println("An old window is closed.");
    }
}
