package HW6;
/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль.
(Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 */
public class HW6{
    public static void main(String[] args) {
        Animal[] animal = {new Cat(200, 2, 0), new Dog(500, 0.5f, 10)};
        for (Animal an : animal)
            System.out.println(
                    an.getClass().getName() +
                            "\nБег: " + an.run(200) +
                            "\nПрыжок: " + an.jump(1.5f) +
                            "\nПлавание: " + an.swim(5));
    }
}
class Cat extends Animal {
    Cat(int run_limit, float jump_limit, int swim_limit) {
        super(run_limit, jump_limit, swim_limit);
    }
    //@Override
    protected boolean swim(int distance) {
        return false;
    }
}
class Dog extends Animal {
    Dog(int run_limit, float jump_limit, int swim_limit) {
        super(run_limit, jump_limit, swim_limit);
    }
}
abstract class Animal {
    private int run_limit;
    private float jump_limit;
    private int swim_limit;
    Animal(int run_limit, float jump_limit, int swim_limit) {
        this.run_limit = run_limit;
        this.jump_limit = jump_limit;
        this.swim_limit = swim_limit;
    }
    protected boolean run(int distance) {
        return distance <= run_limit;
    }
    protected boolean jump(float height)  {
        return height <= jump_limit;
    }
    protected boolean swim(int distance) {
        return distance <= swim_limit;
    }
}

