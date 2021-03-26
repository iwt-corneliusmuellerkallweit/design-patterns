package Singleton.Volatile;

public class VolatileSingletonExec {
    public static void main(String[] args) {
        go();
    }

    public static void go() {
        VolatileWindowManager volatileWindowManager = VolatileWindowManager.getWindowManager();
        volatileWindowManager.openWindow();
        volatileWindowManager.closeWindow();
    }
}
