package TemplateMethod.Spiele;

public class MenschAergereDichNicht extends Spiel {
    public void verteilen() {
        System.out.println("Alle stellen ihre vier Spielfiguren in die Startlöcher.");
    }

    public void spielLaeuft() {
        System.out.println("Einer nach dem Anderen würfelt, um seine Figürchen wieder nach Hause zu bringen.");
    }

    public void peterBeschwertSich(){
        System.out.println("An einer Stelle hat Peter alle seine Figuren verloren und muss wieder von vorne starten.");
    }

    public void spielBeenden() {
        System.out.println("Endlich hat es jemand geschafft, alle vier Figuren wieder zum Anfang zu manövrieren.");
    }

    public void hook() {
        System.out.println("Peter sagt noch in den Raum herein: \"Immer habe ich so ein Pech...\"");
    }
}
