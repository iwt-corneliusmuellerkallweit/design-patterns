package Proxy.ServerSide;

import java.util.ArrayList;

public class JokeMachine implements JokeMachineRemote {
    ArrayList<String> jokes = new ArrayList<>();

    public JokeMachine() {
        jokes.add("\n\"Wer ist hässlicher als ein Blobfisch?\nPeter.\"");
        jokes.add("\n\"Wer ist so dumm dass er nicht mal die erste Klasse schaffen würde?\nPeter.\"");
        jokes.add("\n\"Wer ist so fett wie fünf Elefanten?\nPeter.\"");
        jokes.add("\n\"Wer ist blöd und stinkt nach Fisch?\nPeter.\"");
    }

    public String tellJoke() {
        int randomNumber = (int) (Math.random() * 4);
        return jokes.get(randomNumber - 1);
    }
}
