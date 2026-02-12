package Week_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
        System.out.println("--------------");
        System.out.println("Names start with 'A': ");
        list.forEach(lists->{
            if(lists.charAt(0)== 'A')
            {
                System.out.println(lists);
            }
        });
        System.out.println("--------------");
        System.out.println("Sorting names :");
       // list.sort((a, b) -> { return -1 * b.compareTo(a); });
//        list.sort(null);
        Collections.sort(list);
        list.forEach(lists->System.out.println(lists));


    }
}
