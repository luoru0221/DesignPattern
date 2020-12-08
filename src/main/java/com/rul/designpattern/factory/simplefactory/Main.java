package com.rul.designpattern.factory.simplefactory;

public class Main {
    public static void main(String[] args) {
        Animal cat = AnimalFactory.createAnimal("cat");
        Animal sheep = AnimalFactory.createAnimal("sheep");
        Animal bird = AnimalFactory.createAnimal("bird");

        cat.sound();
        sheep.sound();
        bird.sound();
    }
}
