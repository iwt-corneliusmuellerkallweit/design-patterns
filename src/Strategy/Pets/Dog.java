package Strategy.Pets;

import Strategy.SoundBehaviour.SoundBehaviorBark;
import Strategy.WalkBehaviour.WalkBehaviorFourLegs;

public class Dog extends Pet{
    public Dog() {
        this.setWalkBehavior(new WalkBehaviorFourLegs());
        this.setSoundBehavior(new SoundBehaviorBark());
    }
}
