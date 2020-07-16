package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare zayats = new Hare();
        Ball kolobok = new Ball();
        Fox lisa = new Fox();
        Wolf volk = new Wolf();
        zayats.tryEat(kolobok);
        kolobok.tryEat(kolobok);
        volk.tryEat(kolobok);
        lisa.tryEat(kolobok);
    }
}
