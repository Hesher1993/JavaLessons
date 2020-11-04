package Java3Lesson4;

public class Task1 {

    public static void main(String[] args) {

        PrintChars printChars = new PrintChars();

        new Thread(printChars::printA).start();
        new Thread(printChars::printB).start();
        new Thread(printChars::printC).start();
    }
}