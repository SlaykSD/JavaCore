package ru.ylab.task3;

/*
 Task3
     Реализовать функцию нечеткого поиска

             fuzzySearch("car", "ca6$$#_rtwheel"); // true
             fuzzySearch("cwhl", "cartwheel"); // true
             fuzzySearch("cwhee", "cartwheel"); // true
             fuzzySearch("cartwheel", "cartwheel"); // true
             fuzzySearch("cwheeel", "cartwheel"); // false
             fuzzySearch("lw", "cartwheel"); // false
  */
public class Main {
    /**
     * Fuzzy search function
     * @param word - key
     * @param line - the line in which you want to find the key
     * @return True - if contains / False - else
     */
    public static boolean fuzzySearch(String word, String line){
        for (int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            int j = line.indexOf(c);
            if(j>=0) {
                line = line.substring(j + 1);
            }else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ac6$$#_rtwheel"));//false
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel")); // true
        System.out.println(fuzzySearch("cwhl", "cartwheel")); // true
        System.out.println(fuzzySearch("cwhee", "cartwheel")); // true
        System.out.println(fuzzySearch("cartwheel", "cartwheel")); // true
        System.out.println(fuzzySearch("cwheeel", "cartwheel")); // false
        System.out.println(fuzzySearch("lw", "cartwheel")); // false
    }
}
