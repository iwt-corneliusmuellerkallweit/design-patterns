package Adapter;

import Adapter.Adapter.EngToGer;
import Adapter.Adapter.GerToEng;
import Adapter.People.DeutschSprachiger;
import Adapter.People.EnglishSpeaker;

public class AdapterExec {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        DeutschSprachiger deutschSprachiger = new DeutschSprachiger();
        EnglishSpeaker englishSpeaker = new EnglishSpeaker();

        deutschSprachiger.sagWas();
        englishSpeaker.saySomething();

        GerToEng gerToEng = new GerToEng(englishSpeaker);
        gerToEng.sagWas();

        EngToGer engToGer = new EngToGer(deutschSprachiger);
        engToGer.saySomething();
    }
}
