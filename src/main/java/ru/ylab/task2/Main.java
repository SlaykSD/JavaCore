package ru.ylab.task2;

public class Main {
    public static void main(String[] args) {
        int [] arr = {5,6,3,2,5,1,4,9};
        sortShell(arr);
        show(arr);
    }
    public static  void  show(int [] arr){
        StringBuilder msg = new StringBuilder("Answer: \n");
        msg.append(" {");
        for (int i : arr) {
            msg.append(" [").append(i).append("]");
        }
        msg.append(" }\n");
        System.out.println(msg.toString());
    }

    /**
     * The usual sorting by class is shell sorting.
     * It is slower than fast sorting, but requires less memory.
     * It is more efficient on small data sets.
     *
     * @param array - array of integers
     */
    public static void sortShell(int[] array) {
        int n = array.length;

        for (int h = n / 2; h > 0; h /= 2) {
            for (int i = h; i < n; i++) {
                int key = array[i];
                int j = i;
                while (j >= h && array[j - h] > key) {
                    array[j] = array[j - h];
                    j -= h;
                }
                array[j] = key;
            }
        }
    }

}
