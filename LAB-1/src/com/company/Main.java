package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 0. Ввести с консоли n целых чисел и поместить их в массив.
             System.out.print("Сколько целых чисел вы собираетесь ввести? ");
                Scanner in = new Scanner(System.in);
                int size = in.nextInt();
                if (size == 0) {
                    System.out.print("Программа завершена.");
                    System.exit(0);
                }
                Integer[] sourceNumbers = new Integer[size];
                System.out.print("Введите целые числа через пробел "
                        + "и нажмите <Enter>: ");
                for (int i = 0; i < size; i++) {
                    sourceNumbers[i] = in.nextInt();
               }
                // 1. Четные и нечетные числа
                //findEvenAndOddNumbers(sourceNumbers);
    }
}
