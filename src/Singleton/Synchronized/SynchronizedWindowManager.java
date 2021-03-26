package Singleton.Synchronized;

public class SynchronizedWindowManager {
    private static SynchronizedWindowManager synchronizedWindowManager;

    private SynchronizedWindowManager(){
        System.out.println("The unique window manager is created.");
    }

    public static synchronized SynchronizedWindowManager getWindowManager() {
        if (synchronizedWindowManager == null) {
            synchronizedWindowManager = new SynchronizedWindowManager();
        }
        return synchronizedWindowManager;
    }

    public void openWindow() {
        System.out.println("A new window is opened.");
    }

    public void closeWindow() {
        System.out.println("An old window is closed.");
    }
}
