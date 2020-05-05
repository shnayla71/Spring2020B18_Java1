package day31_BulkOperation;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // write a program removeDuplicates
     list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
      // remove 1,3,5,8
/*  Integer a=1;        we must it all of them by one by
  list.remove(a);
    Integer b=3;
    list.remove(b);*/
      list.removeAll(Arrays.asList(1,3,5,8));
   //   Integer[] arr={2,4,6};     bu sekilde de olabilir
     // list.removeAll(Arrays.asList(arr));

        System.out.println(list);  // 2,4,6,8
        System.out.println("=========================");
      // remove all ahmed  interview sorusu
        String[] names={"ahmed","john","aoran","ahmed","daniel"};
        ArrayList<String> nameList=new ArrayList<>(Arrays.asList(names));
         nameList.removeAll(Arrays.asList("ahmed"));
        System.out.println(nameList);





    }
}
