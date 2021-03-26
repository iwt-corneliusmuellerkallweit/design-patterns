package TemplateMethod;

import TemplateMethod.Spiele.MenschAergereDichNicht;
import TemplateMethod.Spiele.Uno;

public class SpieleklubHolzminden {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        System.out.println("Peter: \"Was spielen wir denn heute?\"");
        System.out.println("Manni: \"Ach, wie wäre es denn mit Uno?\"");
        System.out.println("Noah: \"Au ja, darauf hätte ich Lust!\"");
        System.out.println("Peter: \"Alles kloar, dann spielen wir Uno.\"\n");

        Uno uno = new Uno();
        uno.spielen();

        System.out.println("\nNoah: \"Na das hat doch Spaß gemacht. Wollen wir noch etwas spielen?\"");
        System.out.println("Manni: \"Gerne! Wie wäre es mit Mensch ärgere dich nicht?\"");
        System.out.println("Peter: \"Solange ich da nicht so schlimm würfel wie ich eben Karten gezogen habe...\"\n");

        MenschAergereDichNicht menschAergereDichNicht = new MenschAergereDichNicht();
        menschAergereDichNicht.spielen();
    }
}
