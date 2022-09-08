package ru.ylab.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    private static Person[] RAW_DATA = new Person[]{
            new Person(0, "Harry"),
            new Person(0, "Harry"), // дубликат
            new Person(1, "Harry"), // тёзка
            new Person(2, "Harry"),
            new Person(3, "Emily"),
            new Person(4, "Jack"),
            new Person(4, "Jack"),
            new Person(5, "Amelia"),
            new Person(5, "Amelia"),
            new Person(6, "Amelia"),
            new Person(7, "Amelia"),
            new Person(8, "Amelia"),
    };

    /**
     * This function performs a query to select from
     * an array of data of type Person.
     * And performs this function:
     * Duplicate filtered, grouped by name, sorted by name and id
     * @param array - unsorted array of type person
     * @return dictionary key - name, value - number of repetitions
     */
    public static Map<String,Long> specialRequest(Person[] array){
        return Arrays.stream(array)
                .filter(Objects::nonNull) //Null elements filtered
                .distinct()//Duplicates filtered
                .sorted(Comparator.comparing(Person::getId))//Sort by id
                .sorted(Comparator.comparing(Person::getName))//Sort by name
                .map(Person::getName)
                .distinct()// Looking for unique names
                .collect(Collectors.toMap(name-> name, //Group by name
                        name -> Arrays.stream(array)
                                .distinct()
                                .filter(p->p.getName().equals(name))
                                .count()));

    }
    public static void show(Map<String,Long> res){
        System.out.println();
        res.forEach((key, value)->{
                    System.out.println("Key: "+ key);
                    System.out.println("Value: "+ value);
                }
        );
    }
    public static void main(String[] args) {
        System.out.println("Raw data:");
        System.out.println();

        for (Person person : RAW_DATA) {
            System.out.println(person.id + " - " + person.name);
        }

        System.out.println();
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("Duplicate filtered, grouped by name, sorted by name and id:");
        System.out.println();
        show(specialRequest(RAW_DATA));
    }
}
 /*
        Task1
            Убрать дубликаты, отсортировать по идентификатору, сгруппировать по имени

            Что должно получиться Key: Amelia
                Value:4
                Key: Emily
                Value:1
                Key: Harry
                Value:3
                Key: Jack
                Value:1
         */
