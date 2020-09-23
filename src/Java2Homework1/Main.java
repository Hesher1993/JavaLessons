package Java2Homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число строк: ");
        int i = scanner.nextInt();
        System.out.println("Введите число колонок: ");
        int l = scanner.nextInt();

        String[][] str = new String[i][l];
        for (int i_ = 0; i_ < i; i_++) {
            for (int l_ = 0; l_ < l; l_++)
            {
                System.out.println("Введите строку [" + i_ + "," + l_ + "]: ");
                str[i_][l_] = scanner.next();
            }
        }
        getArraySumm(str);
    }

    public static void getArraySumm(String[][] str) {
        if (str.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i].length != 4) {
                throw new MyArraySizeException();
            }
        }

        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            for (int l = 0; l < str[i].length; l++) {
                inputDate(str[i][l], i, l);
                sum += Integer.parseInt(str[i][l]);
            }
        }
        System.out.println("Результат: ");
        System.out.println(sum);
    }

    private static void inputDate(String str, int x, int y) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                throw new MyArrayDataException(x, y);
            }
        }
    }
}
