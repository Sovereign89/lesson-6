package ru.geekbrains;

import ru.geekbrains.animals.Animal;
import ru.geekbrains.animals.Cat;
import ru.geekbrains.animals.Dog;

import java.util.Random;

public class Homework {

    public static void main(String[] args) {

        Random random = new Random();
        int countDogs = 0;
        int countCats = 0;

        Animal[] animals = new Animal[9];
        animals[0] = new Dog("Лапка");
        animals[1] = new Dog("Дунька");
        animals[2] = new Dog("Зверь");
        animals[3] = new Dog("Тузик");
        animals[4] = new Cat("Ласка");
        animals[5] = new Cat("Корка");
        animals[6] = new Cat("Жук");
        animals[7] = new Cat("Грызунья");
        animals[8] = new Cat("Рыжик");

        for (Animal animal: animals) {
            int distance = random.nextInt(300);

            animal.run(distance);
            animal.swim(distance);

            switch (animal.getClassName()) {
                case "Dog": countDogs++; break;
                case "Cat": countCats++; break;
                default: break;
            }
        }

        System.out.println("Котов "+countCats);
        System.out.println("Собак "+countDogs);

    }



}
