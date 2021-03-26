package Proxy.ClientSide;

import Proxy.ServerSide.JokeMachine;
import Proxy.ServerSide.JokeMachineRemote;

public class JokeClient implements JokeMachineRemote{
    private JokeMachineRemote machine;

    public JokeClient() {
        System.out.println("*Der Client wird eingeschaltet.*");
        connect();
    }

    public void connect() {
        try {
            this.machine = new JokeMachine();
            System.out.println("*Verbindung mit der Witzemaschine ist hergestellt.*");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String tellJoke() {
        String joke = "\"Was hat zwei Daumen und ist zu blöd zum scheißen?\nWer auch immer diese dysfunktionale Witzemaschine gebaut hat.\"";
        try {
            joke = machine.tellJoke();
            System.out.println("*Der Client hat einen Witz von der Witzemaschine erhalten*");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return joke;
    }
}
