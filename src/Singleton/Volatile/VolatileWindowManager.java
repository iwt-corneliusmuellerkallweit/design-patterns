package Singleton.Volatile;

public class VolatileWindowManager {
    private static volatile VolatileWindowManager volatileWindowManager;

    private VolatileWindowManager(){
        System.out.println("The unique window manager is created.");
    }

    public static synchronized VolatileWindowManager getWindowManager() {
        if (volatileWindowManager == null) {
            volatileWindowManager = new VolatileWindowManager();
        }
        return volatileWindowManager;
    }

    public void openWindow() {
        System.out.println("A new window is opened.");
    }

    public void closeWindow() {
        System.out.println("An old window is closed.");
    }
}
