package ru.ylab.task1;

/**
 * Задание
 * Заполните двумерный массив случайным числами
 * и выведите максимальное, минимальное и среднее значение.
 */
public class Main {
    public static void main(String[] args) {
       TwoDimensionalArray array = new TwoDimensionalArray(5);
       array.fillRandomNumbers(100,-100);
       System.out.println(array.toString());
       System.out.println("Max number is: "+array.findMax());
       System.out.println("Min number is: "+array.findMin());
       System.out.println("Average is: "+array.average());

    }
}
