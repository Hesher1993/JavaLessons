package Lesson7;

class CatS {
    private String name;
    private int appetite;
    private boolean hungry;

    CatS (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void info(){
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }

    void eat (Plate plate){
        if (plate.decreaseFood(appetite))
            if (hungry) {
                hungry = false;
            }
    }


}
