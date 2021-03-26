package Command._Variants.WithUndoButton.Table;

public class Table {
    private boolean clean;

    public void startClean() {
        if (!clean) {
            clean = true;
            System.out.println("The table starts cleaning itself.");
        }
    }

    public void stopClean() {
        if (clean) {
            clean = false;
            System.out.println("The table stopped cleaning itself.");
        }
    }

    public void makeDirty() {
        if (clean) {
            clean = false;
            System.out.println("The table stopped cleaning itself, and made itself dirty again.");
        }
    }
}
