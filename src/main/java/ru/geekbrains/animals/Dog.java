package ru.geekbrains.animals;

public class Dog extends Animal {

    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
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
        if (distance > 0 && distance <= MAX_SWIM_DISTANCE) {
            System.out.println(name + " проплыл(а) " + distance + " м.");
        } else if (distance < 0) {
            System.out.println("Невозможно проплыть отрицательное расстояние");
        } else {
            System.out.println(name + " не может проплыть больше чем " + MAX_SWIM_DISTANCE + " м.");
        }
    }

}
