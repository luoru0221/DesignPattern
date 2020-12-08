package com.rul.designpattern.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        AnimalFactory birdFactory = new BirdFactory();
        Animal bird = birdFactory.create();
        bird.sound();

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.create();
        cat.sound();

        AnimalFactory sheepFactory = new SheepFactory();
        Animal sheep = sheepFactory.create();
        sheep.sound();
    }
}
