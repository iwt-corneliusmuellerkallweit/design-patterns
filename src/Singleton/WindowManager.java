package Singleton;

public class WindowManager {
    private static WindowManager windowManager;

    private WindowManager(){
        System.out.println("The unique window manager is created.");
    }

    public static WindowManager getWindowManager() {
        if (windowManager == null) {
            windowManager = new WindowManager();
        }
        return windowManager;
    }

    public void openWindow() {
        System.out.println("A new window is opened.");
    }

    public void closeWindow() {
        System.out.println("An old window is closed.");
    }
}
