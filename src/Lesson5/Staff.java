package Lesson5;

public class Staff {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private String salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Staff(String fio, String position, String email, String phone, String salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
        public void printInfo(){System.out.println("fio " + this.fio + "position " + this.position + "email " + this.email
         + "phone " + this.phone + "salary " + this.salary + "age " + this.age);}
}
