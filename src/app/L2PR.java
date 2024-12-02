package app;

import app.models.Animal;
import app.models.Cat;
import app.models.Dog;


public class L2PR {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурчик");
        Cat cat2 = new Cat("Том");
        Dog dog1 = new Dog("Бобік");
        Dog dog2 = new Dog("Умка");

        cat1.run(150);
        cat1.swim(10);

        cat2.run(400);
        cat2.swim(8);

        dog1.run(300);
        dog1.swim(10);

        dog2.run(600);
        dog2.swim(15);

        System.out.println("Кількість тварин " + Animal.getAnimalCount() + ".");
        System.out.println("Кількість котів " + Cat.getCatCount()+ ".");
        System.out.println("Кількість собак " + Dog.getDogCount() + ".");

    }
}