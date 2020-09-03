package Lesson5;

public class Main {

    public static void main(String[] args) {
        Staff[] staff = new Staff[5];
        staff[0] = new Staff("Durant ", "attack guard ", "durant@gmail.com ", "899999907 ", "25 ", 31);
        staff[1] = new Staff("Harden ", "point guard ", "harden@gmail.com ", "899999913 ", "30 ", 30);
        staff[2] = new Staff("O'neal ", "heavy forward ", "shaq@gmail.com ", "899999934 ", "50 ", 45);
        staff[3] = new Staff("Jordan ", "attack guard ", "mj@gmail.com ", "899999923 ", "60 ", 50);
        staff[4] = new Staff("Carry ", "point guard ", "stef@gmail.com ", "899999928 ", "33 ", 34);
        for (int i=0; i<staff.length; i++){
            if (staff[i].getAge() > 40){
                staff[i].printInfo();
            }
        }
    }
}

