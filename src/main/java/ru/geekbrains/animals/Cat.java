package ru.geekbrains.animals;

public class Cat extends Animal {

    private static final int MAX_RUN_DISTANCE = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал(а) " + distance + " м.");
        } else if (distance < 0) {
            System.out.println("Невозможно пробежать отрицательное расстояние");
        } else {
            System.out.println(name + " не может пробежать больше чем " + MAX_RUN_DISTANCE + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }

}
