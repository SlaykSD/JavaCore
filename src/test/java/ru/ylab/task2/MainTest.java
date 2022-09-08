package ru.ylab.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class MainTest {
    @Test
    void checkShellSort(){
       int[] arr = {1,3,4,5,-102,234,1010,2300,234,1294,23};
       int[] res = {-102,1,3,4,5,23,234,234,1010,1294,2300};
       Main.sortShell(arr);
        for (int i=0; i< arr.length; i++) {
            assertEquals(arr[i],res[i]);
        }
    }
    @Test
    void checkShellSort2(){
        int[] arr = {1,Integer.MIN_VALUE};
        int[] res = {Integer.MIN_VALUE,1};
        Main.sortShell(arr);
        for (int i=0; i< arr.length; i++) {
            assertEquals(arr[i],res[i]);
        }
    }
}