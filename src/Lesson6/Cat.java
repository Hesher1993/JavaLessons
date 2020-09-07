package Lesson6;

public class Cat extends Animal {

    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;

    }

    public void printCatInfo(){
        System.out.println("Cat: name = " + name + "; age = " + age +"; color = " + color);
    }

    public void meow(){
        System.out.println("Кошка мяукнула!");
        }


    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
