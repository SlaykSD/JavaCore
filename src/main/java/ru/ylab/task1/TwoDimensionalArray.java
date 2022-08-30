package ru.ylab.task1;


/**
 * An example of a two-dimensional array
 * that meets the requirements of the task
 */
public class TwoDimensionalArray {
    private  int[][] arr ;
    private  int size ;

    public void setArr(int[][] arr) {
        if(!(arr== null || arr.length != 2)) {
            this.arr = arr;
            this.size = arr[0].length;
        }
    }

    public int[][] getArr() {
        return arr;
    }

    @Override
    public String toString() {
        StringBuilder msg = new StringBuilder("TwoDimensionalArray\n");
        for (int i = 0 ; i< 2 ;i++){
            msg.append(" {");
            for (int j=0; j< size; j++){
                msg.append(" [").append(arr[i][j]).append("]");
            }
            msg.append(" }\n");
        }
        return msg.toString();
    }

    public TwoDimensionalArray(int size){
        this.size = size;
        arr = new int[2][size];
    }
    public TwoDimensionalArray(int [][] arr){
        setArr(arr);
    }

    public void fillRandomNumbers(int max, int min){
        for (int i = 0 ; i< 2 ;i++){
            for (int j=0; j< size; j++){
                arr[i][j] = getRandomInt(max,min);
            }
        }
    }
    public int findMax(){
        int res = Integer.MIN_VALUE;
        for (int i = 0 ; i< 2 ;i++){
            for (int j=0; j< size; j++){
               if(arr[i][j]> res)
                   res = arr[i][j];
            }
        }
        return  res;
    }

    public int findMin(){
        int res = Integer.MAX_VALUE;
        for (int i = 0 ; i< 2 ;i++){
            for (int j=0; j< size; j++){
                if(arr[i][j]< res)
                    res = arr[i][j];
            }
        }
        return  res;
    }
    public double average(){
        int res = 0;
        for (int i = 0 ; i< 2 ;i++){
            for (int j=0; j< size; j++){
                res += arr[i][j];
            }
        }
        return  (double) res/(size*2);
    }
    public static  int getRandomInt(int max , int min){
        return (int) (Math.random()*((max-min)+1))+min;
    }
}