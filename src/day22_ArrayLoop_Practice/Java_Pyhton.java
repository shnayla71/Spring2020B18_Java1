package day22_ArrayLoop_Practice;

import java.util.Arrays;

public class Java_Pyhton {
    public static void main(String[] args) {
        String sentence="I like java and javascript";
        sentence=sentence.toLowerCase();// cumle icinde gecis sekli icin
        int countjava=0;
        int countpyhton=0;
       String[] words=sentence.split(" ");//[i,like,java,and,javascript]
        for(String each:words){
           if(each.contains("java")){
               countjava++;
           }
           if(each.contains("phyton")){
               countpyhton++;
           }
        }
        System.out.println(countjava == countpyhton);











    }
}
