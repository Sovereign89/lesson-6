package ru.geekbrains.animals;

public abstract class Animal {

    protected String name;
    protected String className;

    protected Animal(String name) {
        this.name = name;
        this.className = this.getClass().getSimpleName();
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public String getClassName() {
        return className;
    }

}
