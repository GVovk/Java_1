package Lesson7;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cписок котов:");
        Cat[] x = {new Cat("Кот1", 8), new Cat("Кот2", 3), new Cat("Кот3", 7)};
        Plate plate = new Plate(10);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("***");
        System.out.println("Наполнить тарелку 5");
        plate.increaseFood(5);
        System.out.println(plate);
        System.out.println("***");
        System.out.println("Коты едят:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
} }
