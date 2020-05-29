/*
Ввести с консоли n-размерность матрицы a [n] [n].
Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.

Найти число локальных минимумов.
(Соседями элемента матрицы назовем элементы, имеющие с ним общую сторону или угол.
Элемент матрицы называется локальным минимумом, если он строго меньше всех своих соседей.)
*/

package com.company;
//import com.company.Matrix;
//import com.company.NumberOfLocalMin;

import javax.swing.plaf.synth.SynthStyle;
import java.util.Scanner;
import java.util.Date;
//import static java.lang.Math.random;

/**
 * Find a number of local mimimum
 * @author Chirko Yanina
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы n*n: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size == 0) {
            System.out.println("Программа завершена.");
            System.exit(0);
        }

        NumberOfLocalMin.findNumberOfLocalMin(size,size);
        System.out.print("\nДата и время сдачи задания:\n");
        Date date=new Date();
        //Вывод текущей даты и времени использования toString()
        System.out.println(date.toString());

    }
}

