package TemplateMethod.Spiele;

public abstract class Spiel {

    public void spielen() {
        entpacken();
        verteilen();
        spielLaeuft();
        peterBeschwertSich();
        spielBeenden();
        zusammenpacken();
        hook();
    }

    public void entpacken() {
        System.out.println("Das Spiel wird aus dem Spieleregal genommen und ausgepackt.");
    }

    public abstract void verteilen();
    public abstract void spielLaeuft();
    public void peterBeschwertSich() {
        System.out.println("Es wäre kein Spiel beim Spieleklub Holzminden wenn sich Peter nicht über sein Unglück beschweren würde.");
    }
    public abstract void spielBeenden();
    public void zusammenpacken() {
        System.out.println("Alles wird wieder zusammengepackt und ins Spieleregal gestellt.");
    }
    public void hook() {}
}
