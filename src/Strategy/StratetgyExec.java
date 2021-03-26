package Strategy;

import Strategy.Pets.*;
import Strategy.WalkBehaviour.WalkBehaviorFourLegs;

public class StratetgyExec {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        Pet dog = new Dog();
        Pet cat = new Cat();
        Pet snake = new Snake();
        Pet goldfish = new Goldfish();

        dog.performSound();
        cat.performWalk();
        snake.performSound();
        goldfish.performWalk();

        System.out.println("\nNow, let's give the snake legs!");
        snake.setWalkBehavior(new WalkBehaviorFourLegs());
        snake.performWalk();
    }
}
