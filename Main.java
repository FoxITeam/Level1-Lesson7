package ru.foxit.grayfox;

public class Main {

    private static int countEat = 0;
    private static int foodPlate = 13;

    public static void main(String[] args) {

        System.out.println("Привет друг! Я уезжаю на работу, покорми пока моих котят, в холодильнике еда!");

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Мурзилка", 4);
        cats[1] = new Cat("Шарик", 3);
        cats[2] = new Cat("Маргарита", 4);
        cats[3] = new Cat("Рыжик", 3);
        Plate plate = new Plate(foodPlate);

        for (Cat cat : cats) {
            if (!cat.eat(plate)) {
                countEat += cat.getAppetite();
            }
            System.out.println(cat.toString());
        }

        plate.info();

        if (countEat > 0) {
            System.out.println("Ты наложил слишком мало еды и не все котики поели, нехватило " + countEat + " еды!");
            System.out.println("Друг подошел к холодильнику и наложил в тарелку еды.");

            plate.addFood(countEat - plate.getFood());

            for (Cat cat : cats) {
                cat.eat(plate);
                System.out.println(cat.toString());
            }


            plate.info();
            System.out.println("Пришел хозяин котиков. Спасибо, что покормил моих котят!");

        } else {
            System.out.println("Пришел хозяин котиков. Спасибо, что покормил моих котят!");
        }
    }
}
