package day32_Predicate;

import java.util.ArrayList;

public class Warmup3 {
    public static void main(String[] args) {
      /*  str = "ABCD123$%#@&456EFG!";
        list1: {$, %, #, @, &, !}
        list2: {A, B, C, D, E, F, G}
        list3: {1, 2, 3, 4, 5, 6}*/
      String str="ABCD123$%#@&456EFG!";
      /*  ArrayList<Character> digit=new ArrayList<>();
        ArrayList<Character> alp=new ArrayList<>();
        ArrayList<Character> special=new ArrayList<>();
        for(int i=0;i<str.length();i++) {
            Character ch = str.charAt(i);
            if(Character.isLetter(ch)){
                alp.add(ch);
            }
            if(Character.isDigit(ch)){
                digit.add(ch);
            }
            if(!Character.isLetterOrDigit(ch)){
                special.add(ch);
            }
        }
        System.out.println(digit);
        System.out.println(alp);
        System.out.println(special);*/
      char[] arr=str.toCharArray();


      ArrayList<Character> letters=new ArrayList<>();
      ArrayList<Character> digit=new ArrayList<>();
      ArrayList<Character> Char=new ArrayList<>();

      for(char each:arr){
          if(Character.isLetter(each)){
              letters.add(each);
          }
          if(Character.isDigit(each)){
              digit.add(each);
          }
          if(!Character.isLetterOrDigit(each)){
              Char.add(each);
          }
      }
        System.out.println(letters);
        System.out.println(digit);
        System.out.println(Char);





    }
}
