package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        /*
        list={"a","b","a","c","d"}
        output={"a"}
         */
        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("A","B","C","A","D"));
        System.out.println(list);

        ArrayList<String> duplist=new ArrayList<>();
      for(int i=0;i<list.size();i++) {
          int count = 0;
          for (String each : list) {
              if (each.equals(list.get(i))) {
                  count++;
              }
          }
          if (count > 1) {  // sadece A istersek && !duplist.contains(list.get(i)) eklememiz yeterli
              duplist.add(list.get(i));
          }
      }
        System.out.println(duplist);








    }
}
