package ru.ylab.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDimensionalArrayTest {
    @Test
     void findMax1(){
        int [][] arr = {{1,3,4},{1,1,1}};
        int max = 4;
        TwoDimensionalArray testArray =  new TwoDimensionalArray(arr);
        assertEquals(max, testArray.findMax());
    }

    @Test
    void findMax2(){
        int [][] arr = {{Integer.MIN_VALUE},{Integer.MAX_VALUE}};
        int max = Integer.MAX_VALUE;
        TwoDimensionalArray testArray =  new TwoDimensionalArray(arr);
        assertEquals(max, testArray.findMax());
    }

    @Test
    void findMin1(){
        int [][] arr = {{1,3,4},{1,-100,1}};
        int min = -100;
        TwoDimensionalArray testArray =  new TwoDimensionalArray(arr);
        assertEquals(min, testArray.findMin());
    }

    @Test
    void findMin2(){
        int [][] arr = {{Integer.MIN_VALUE},{Integer.MAX_VALUE}};
        int min = Integer.MIN_VALUE;
        TwoDimensionalArray testArray =  new TwoDimensionalArray(arr);
        assertEquals(min, testArray.findMin());
    }

    @Test
    void average1(){
        int [][] arr = {{1,3,4},{1,-100,1}};
        double avg = -15.0;
        TwoDimensionalArray testArray =  new TwoDimensionalArray(arr);
        assertEquals(avg, testArray.average());
    }

    @Test
    void average2(){
        int [][] arr = {{Integer.MIN_VALUE},{Integer.MAX_VALUE}};

        double avg = ((double) (Integer.MAX_VALUE + Integer.MIN_VALUE))/2;
        TwoDimensionalArray testArray =  new TwoDimensionalArray(arr);
        assertEquals(avg, testArray.average());
    }
}