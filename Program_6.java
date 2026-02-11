package Week_2;

import java.util.ArrayList;
import java.util.List;

public class Program_6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(10);
        list.add("Vaishnavi");
        list.add("Arnav");
        list.add("Purva");
        list.add("Lalit");
        list.add("Gauri");
        list.add("Akshay");

        System.out.println("List elements are : ");
        list.forEach((n)-> System.out.println(n));

//        System.out.println("Names start with 'A': ");
//        list.stream().forEach((n)->
//                {
//
//                }
//        );

        System.out.println("Sorting names :");
        list.sort((a, b) -> { return -1 * b.compareTo(a); });
//        list.sort(null);
        System.out.println(list);

    }
}
