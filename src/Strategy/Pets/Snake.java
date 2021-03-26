package Strategy.Pets;

import Strategy.SoundBehaviour.SoundBehaviorHiss;
import Strategy.WalkBehaviour.WalkBehaviorSlither;

public class Snake extends Pet {
    public Snake() {
        this.setWalkBehavior(new WalkBehaviorSlither());
        this.setSoundBehavior(new SoundBehaviorHiss());
    }
}
