package Lesson7;

public class MainEat {
    public static void main(String[] args) {
        CatS[] cat = {new CatS("Sanya",3), new CatS("Busya", 7), new CatS("Barsik", 8)};
        Plate plate = new Plate(10);
        for (CatS catS : cat) {
            catS.eat(plate);
            catS.info();

        }
    }
}
