package Singleton.Eager;

public class EagerSingletonExec {
    public static void main(String[] args) {
        go();
    }

    public static void go() {
        EagerWindowManager eagerWindowManager = EagerWindowManager.getWindowManager();
        eagerWindowManager.openWindow();
        eagerWindowManager.closeWindow();
    }
}
