package Lesson6;

public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat("Bar",2,"white");
        Dog dog = new Dog("Ryz",6,"Dv");

        cat.meow();
        //cat.printCatInfo();
        cat.printInfo();

        dog.bark();
        //dog.printDogInfo();
        dog.printInfo();

        Animal animal = new Animal("animal 1", 55);
        animal.printInfo();
    }
}
