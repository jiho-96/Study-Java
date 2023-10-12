package com.mystudy.ex01;

import com.mystudy.ex01.Animal;
import com.mystudy.ex01.Cat;
import com.mystudy.ex01.Dog;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
