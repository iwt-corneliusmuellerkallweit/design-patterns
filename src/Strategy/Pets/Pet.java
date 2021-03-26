package Strategy.Pets;

import Strategy.SoundBehaviour.SoundBehavior;
import Strategy.WalkBehaviour.WalkBehavior;

public class Pet {
    private WalkBehavior walkBehavior;
    private SoundBehavior soundBehavior;

    public WalkBehavior getWalkBehavior() {
        return walkBehavior;
    }

    public void setWalkBehavior(WalkBehavior walkBehavior) {
        this.walkBehavior = walkBehavior;
    }

    public SoundBehavior getSoundBehavior() {
        return soundBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }


    public void performWalk() {
        walkBehavior.walk();
    }

    public void performSound() {
        soundBehavior.makeSound();
    }
}
