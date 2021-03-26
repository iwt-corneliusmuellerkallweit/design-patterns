package Strategy.Pets;

import Strategy.SoundBehaviour.SoundBehaviorMeow;
import Strategy.WalkBehaviour.WalkBehaviorFourLegs;

public class Cat extends Pet{
    public Cat() {
        this.setWalkBehavior(new WalkBehaviorFourLegs());
        this.setSoundBehavior(new SoundBehaviorMeow());
    }
}
