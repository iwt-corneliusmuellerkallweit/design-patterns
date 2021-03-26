package Strategy.Pets;

import Strategy.SoundBehaviour.SoundBehaviorNone;
import Strategy.WalkBehaviour.WalkBehaviorFlop;

public class Goldfish extends Pet {
    public Goldfish() {
        this.setWalkBehavior(new WalkBehaviorFlop());
        this.setSoundBehavior(new SoundBehaviorNone());
    }
}
