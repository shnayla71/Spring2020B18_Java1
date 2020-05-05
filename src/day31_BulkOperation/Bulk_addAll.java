package day31_BulkOperation;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        // add 30,20,40,50,45,35,200
     /*   list1.add(30);
        list1.add(20);
          .....
           .... seklinde tek tek eklemek yerine */

        list1.addAll(Arrays.asList(30,20,40,50,45,35,200));
        System.out.println(list1);

        Integer[] arr1={30,20,40,50,45,35,200}; // it can't be int[] arr1 because it is primitive
        list1.addAll(Arrays.asList(arr1));
        System.out.println(list1);

        System.out.println("===========================");
        String[] names={"muhtar","mahsun","madur","mazlum"};
                    //     0        1       2        3
// names[4]="osman";
        System.out.println(Arrays.toString(names));// eklemez cunku size sabit array de degismez
        ArrayList<String> nameslist=new ArrayList<>();
             nameslist.addAll(Arrays.asList(names));
             nameslist.add("osman");// burda ekler
             nameslist.remove("muhtar");// muhtar siler cunku object. M olsaydi yazmazdi case sensetive cunku remove
        System.out.println(nameslist);
        System.out.println("===================");

        Integer[] numbers={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> numList=new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numList); // tum numbers lari numList e gecirir ama int olsa yapmazdi sadece object kabul eder primitive degil







    }
}
