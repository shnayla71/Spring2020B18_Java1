package day21_MultiDimential;

import java.util.Arrays;

public class Lorgest_ShortestWord {
    public static void main(String[] args) {
        String[] names={"ana","reem","omer","muhtar","muhammed"};

        int maxLength=names[0].length();// burasi 0 old icin asagi 1 den basladi
        int minLength=names[0].length();
       String longestWord=names[0];
       String shortestWord=names[0];
       for(int i=1;i<names.length;i++){
            if(names[i].length()>maxLength){
                maxLength=names[i].length();
                longestWord=names[i];
            }
            if(names[i].length()<minLength){
                minLength=names[i].length();
                shortestWord=names[i];
            }
        }
          System.out.println(longestWord);
          System.out.println(shortestWord);







    }
}
