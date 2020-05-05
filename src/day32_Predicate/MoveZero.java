package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class MoveZero {
    public static void main(String[] args) {
        /* list={1,0,2,0,3,0,4,0}
        output={1,2,3,4,0,0,0,0}
         */
        ArrayList<Integer> list=new ArrayList<>();
         list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        int count=0;
        for(Integer each:list){
            if(each==0){
                count++;
            }
        }     list.removeAll(Arrays.asList(0)); // 1,2,3,4
              System.out.println(list);

              for(int i=0;i<count;i++) {
                  list.add(0);
                  // eger basa ekle deseydi add(0,0)yazardik
                  // lastindexten ekler
              }
        System.out.println(list);

    int count1=Collections.frequency(list,0); // kac tane 0 var sayiyor
        System.out.println(count1);
        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        for(int i=0;i<count;i++){
            list.add(0);
        }
        System.out.println(list);
    }
}
