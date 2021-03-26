package Singleton;

public class SingletonExec {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        WindowManager windowManager = WindowManager.getWindowManager();
        windowManager.openWindow();
        windowManager.closeWindow();
    }
}
