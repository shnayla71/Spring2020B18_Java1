package Saim_Class;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountLetter {
    public static void main(String[] args) {
     countLetters("apple");
        /*
        String s="apple";
        a-1
        p-2
        l-1
        e-1
         */

    }
    public static void countLetters(String str){
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char key=str.charAt(i);
            if(!map.containsKey(key)){
                map.put(key,0);
            }
            map.put(key,map.get(key)+1);
        }
        System.out.println(map);
    }
}
