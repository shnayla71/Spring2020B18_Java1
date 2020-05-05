package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniqes {
    public static void main(String[] args) {
        // write a program that can return the uniqe objects from arraylist character

      Character[] chars={'A','A','B','C','D','D'};
        ArrayList<Character> charList=new ArrayList<>(Arrays.asList(chars));
        System.out.println(charList);

        ArrayList<Character> result=new ArrayList<>();// unique leri koymak icin

        for(int i=0;i<charList.size();i++) { //Character each:charlist
            int count = Collections.frequency(charList, charList.get(i));// charlist,each yapmaliydik for eachte
            if (count == 1) {
                result.add(charList.get(i));
            }
        }
        System.out.println(result);



    }
}
