package ru.ylab.task2;

  /*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару именно в скобках, которые дают сумму - 10
         */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Main {
    static final Integer [] RAW = {3,4,2,7};

    /**
     * The function searches for two elements of an unsorted
     * array whose sum is equal to a given number.
     *
     *
     * @param mas - array of Integer
     * @param specialNumber - a given sum of two numbers of the array
     * @return an array of two numbers  OR null (if not found the pair)
     */
    public static Integer[] findSpecialPair(Integer[] mas, Integer specialNumber){

        Arrays.sort(mas);//if array not contains null elements
        int lt = 0;
        int rt = mas.length-1;
        while (lt != rt){
            int curr = mas[lt]+ mas[rt];
            if(curr< specialNumber){
                lt++;
            }
            else if(curr> specialNumber){
                rt--;
            }else {
                return new Integer[] {mas[lt],mas[rt]};
            }
        }
        return null;
    }


    /**
     * Show the result
     */
    public  static void show(Integer[] data, Integer[] result, Integer sum){
        System.out.print("[");
        for (int i = 0; i< data.length-1;i++){
            System.out.print(data[i]+", ");
        }
        System.out.print(data[data.length-1]+"], "+sum+" -> ");
        if(result!=null) {
            System.out.print("[" + result[0] + ", " + result[1] + "]");
        }else{
            System.out.println("Not found");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        var arr = findSpecialPair(RAW,10);
        show(RAW,arr,10);

        //For test
        Integer[] dataSet1 = {1,10,16,29,-10,20,30,100}; //find 10
        arr = findSpecialPair(dataSet1,10);
        show(dataSet1,arr,10);

        arr = findSpecialPair(dataSet1,11);
        show(dataSet1,arr,11);

        arr = findSpecialPair(dataSet1,12);
        show(dataSet1,arr,12);
    }
}
