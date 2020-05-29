package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EvensAndOdds {
    private static void findEvenAndOddNumbers(Integer[] sourceNumbers) {
        List<Integer> evens = new ArrayList<Integer>();
        List<Integer> odds = new ArrayList<Integer>();
        for (Integer sourceNumber : sourceNumbers) {
            if (sourceNumber % 2 == 0) {
                final boolean add = evens.add(sourceNumber);
            } else {
                odds.add(sourceNumber);
            }
        }
        System.out.println("Чётные числа: " + evens);
        System.out.println("Нечётные числа: " + odds);
    }
    //class Array{
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
            findEvenAndOddNumbers(sourceNumbers);
    }}
