package lessonseven;


import lessonseven.homework.Cat;
import lessonseven.homework.Plate;

public class Main {

    public static void main(String[] args) {
        int foodCount = 20;
        Cat cat = new Cat("Barsik", 10);
        Plate plate = new Plate(foodCount);
        plate.info();
        System.out.println(cat.getAppetite());
        cat.eat(plate);
        plate.info();
        cat.setAppetite(cat.getAppetite() - foodCount <= 0 ? 0 : cat.getAppetite() - foodCount);
        System.out.println(cat.getAppetite());
    }
}