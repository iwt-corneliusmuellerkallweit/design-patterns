package TemplateMethod.Spiele;

public class Uno extends Spiel {
    public void verteilen() {
        System.out.println("Alle ziehen ihre Starthand. Eine einzelne Karte liegt offen auf dem Tisch, die restlichen Karten liegen verdeckt auf einem Stapel.");
    }

    public void spielLaeuft() {
        System.out.println("Einer nach dem anderen versucht eine Handkarte auf den offenen Stapel zu legen. Wer nicht bedienen kann muss ziehen.");
    }

    public void spielBeenden() {
        System.out.println("\"Uno!\" schreit jemand am Tisch. Danach ging das Spiel schnell zu Ende.");
    }
}
