package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {
        Predicate<Integer> oddNum= x -> x % 2 != 0;
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddNum);
        System.out.println(list);
        System.out.println("====================");
        Predicate<Integer> lessThan5= y ->y<5;
        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list1.removeIf(lessThan5);
        System.out.println(list1);
        System.out.println("===================");
        Predicate<String> startsWithM= s-> s.startsWith("M");// s.toLowerCase() yapabiliriz
        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("ayse","fatma","selma","Melma","bilal"));
        names.removeIf(startsWithM);
        System.out.println(names);

    }
}
