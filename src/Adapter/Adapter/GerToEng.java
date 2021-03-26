package Adapter.Adapter;

import Adapter.Languages.Deutsch;
import Adapter.People.EnglishSpeaker;

public class GerToEng implements Deutsch {
    EnglishSpeaker englishSpeaker;

    public GerToEng(EnglishSpeaker englishSpeaker) {
        this.englishSpeaker = englishSpeaker;
    }

    public void sagWas() {
        englishSpeaker.saySomething();
    }
}
