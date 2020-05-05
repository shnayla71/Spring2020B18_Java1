package day31_BulkOperation;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_containsAll {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
          list1.add(10);
          list1.add(20);
          list1.add(30);
          list1.add(40);
          // if 10,20,60 if all objects are exits in arraylist=true else false
        boolean r1=list1.contains(10);
        boolean r2=list1.contains(20);
        boolean r3=list1.contains(60);
        boolean result=r1==true && r2==true && r3==true;
        System.out.println(result);

          // if 10,20,60,90,100,200,300 olsaydi soru

        boolean result1=list1.containsAll(Arrays.asList(10,20,60,90,100,200,300));
       boolean result3=list1.containsAll(Arrays.asList(30,40));
        System.out.println(result1);// false
        System.out.println(result3); // true

        // 10,30,40
         Integer[] data={10,30,40};
          //  int[] data1={10,30,40}; gives compiler error because of int only accept object
         boolean result4=list1.containsAll(Arrays.asList(data));
        System.out.println(result4); // true

        // list1.containsAll(1,3,10,30); error because of not object

    }
}
