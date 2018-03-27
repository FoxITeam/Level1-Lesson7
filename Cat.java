package ru.foxit.grayfox;

public class Cat {
    private String nameCat;
    private int appetiteCat;
    private boolean full = false;

    public Cat(String name, int appetite) {
        this.nameCat = name;
        this.appetiteCat = appetite;
    }

    public boolean eat(Plate plate) {
        if (plate.getFood() >= appetiteCat && !isFull()) {
            plate.decreaseFood(appetiteCat);
            setFull(true);
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public int getAppetite() {
        return appetiteCat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Имя кота = '" + nameCat + '\'' +
                ", Ты сытый? = " + full +
                '}';
    }
}
