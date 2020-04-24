package OfficeHours2_Arrays;

import java.util.Arrays;

public class Split_Arrays {
    public static void main(String[] args) {
        String str="I like to learn java";
        String[] word=str.split(" ");
        System.out.println(Arrays.toString(word));
        int totalWord=word.length;
        System.out.println(totalWord);

        // java learn to like I
        String result="";
        for(int i=word.length-1;i>=0;i--){
            result += word[i]+" ";

        }System.out.println(result.trim());
















    }
}
