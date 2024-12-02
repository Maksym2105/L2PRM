package app.models;

public class Animal {

    private static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    protected String name;

    public void run(int distance){
    }

    public void swim(int distance){
    }

    public static int getAnimalCount(){
        return animalCount;
    }
}