package Iterator;

public class IteratorExec {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        DinerMenu diner = new DinerMenu();
        PancakeHouseMenu house = new PancakeHouseMenu();

        Waitress waitress = new Waitress(house, diner);
        waitress.printMenu();
    }
}
