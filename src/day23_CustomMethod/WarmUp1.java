package day23_CustomMethod;

import java.util.Arrays;

public class WarmUp1 {
    public static void main(String[] args) {
        String[] ch={"A","B","C","C"};

     for(String each1:ch) {
         int count1 = 0;
         for (int i = 0; i < ch.length; i++) {
             if (ch[i].equals(each1)) {
                 count1++;
             }
         }
         if (count1 == 1) {
             System.out.println(each1);
         }

     }

        for(String each2:ch){
            int count=0;
        for(String each:ch){
            if(each.equals(each2)){
                count++;
            }}
            if(count==1){
        System.out.println(each2);}
    }
}}
