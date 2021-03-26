package Adapter.People;

import Adapter.Languages.English;

public class EnglishSpeaker implements English {
    public void saySomething() {
        System.out.println("Hello there!");
    }
}
