package ru.foxit.grayfox;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("В нашей тарелке для котиков: " + food + " еды.");
    }
    public void addFood(int food) {
        setFood(getFood() + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
