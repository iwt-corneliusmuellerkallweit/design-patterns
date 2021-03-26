package Adapter.Adapter;

import Adapter.People.DeutschSprachiger;
import Adapter.Languages.English;

public class EngToGer implements English {
    DeutschSprachiger deutschSprachiger;

    public EngToGer(DeutschSprachiger deutschSprachiger) {
        this.deutschSprachiger = deutschSprachiger;
    }

    public void saySomething() {
        deutschSprachiger.sagWas();
    }
}
