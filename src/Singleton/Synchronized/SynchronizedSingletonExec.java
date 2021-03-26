package Singleton.Synchronized;

public class SynchronizedSingletonExec {
    public static void main(String[] args) {
        go();
    }

    public static void go() {
        SynchronizedWindowManager synchronizedWindowManager = SynchronizedWindowManager.getWindowManager();
        synchronizedWindowManager.openWindow();
        synchronizedWindowManager.closeWindow();
    }
}
