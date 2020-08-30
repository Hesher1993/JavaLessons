package ru.geekbrains.secondstep;

import java.util.Scanner;

public class task1lesson3 {
    public static int answerCount = 3;
    public static boolean restartGame;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 9; i <= 9; i += 9) {
            restartGame = true;
            while (restartGame) {
                guessNumber(i);
                restartGame();
            }
        }
        System.out.println("Игра завершена!");
    }

    private static void restartGame() {
        int input_answer = scanner.nextInt();
        int yes = 1;
        if (restartGame){
            System.out.println("Введите - 1, если хотите продожить игру.");
            input_answer=scanner.nextInt();
            if (input_answer == yes ){
                System.out.println("Попробуем еще раз");
                answerCount=3;
            } else {
                restartGame=false;
                scanner.close();
            }
        }
    }

    public static void guessNumber(int range) {
        int number = (int) (Math.random() * range);
        System.out.println("Угадайте число от 0 до " + range + ". У вас на это " + (answerCount) + " попытки");
        while (true) {
            if (answerCount < 0) {
                System.out.println("Вы проиграли \n Играем еще?");
                break;
            }
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали. Играем еще?");
                answerCount = 3;
                restartGame = true;
                break;
            } else if (input_number > number) {
                System.out.println("Указанное число меньше");
                System.out.println("Для ответа осталось: " + answerCount + ".");
                answerCount--;
            } else {
                System.out.println("Загаданное число больше");
                System.out.println("Для ответа осталось: " + answerCount + ".");
                answerCount--;
            }
        }


    }
}


