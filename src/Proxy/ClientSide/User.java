package Proxy.ClientSide;


public class User {
    public static void main(String[] args) {
        User.go();
    }

    private static void go() {
        String space = " ".repeat(7);
        System.out.println("\nPeter: \"Oh Junge, heute bin ich richtig traurig.\n" +
                space + "Vielleicht kann die alte Witzmaschine mich mal wieder aufmuntern.\"\n");
        System.out.println("Peter schaltet den PC ein und öffnet seinen Witze-Client.\n");

        JokeClient client = new JokeClient();

        System.out.println("\nPeter: \"Jetzt wo ich den Witze-Client eingeschaltet habe\n" +
                        space + "klicke ich auf den Button 'Generiere Witz'.\"\n");

        String joke = client.tellJoke();

        System.out.println("\nPeter: \"Oh Junge, ich kann es kaum erwarten einen lustigen Witz zu lesen!\"");

        System.out.println(joke);

        System.out.println("\nPeter: \"Den fand ich jetzt nicht so lustig...\"");
    }
}
