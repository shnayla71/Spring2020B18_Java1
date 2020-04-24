package day17_whileLoop;

public class palendromPractice_while {
    public static void main(String[] args) {
        String str="anna";
        String reverseStr="";
        int index=str.length()-1;// last index number
        while(index>=0){
            reverseStr += str.charAt(index);
            index--;
        }
        boolean palindrome=reverseStr.equalsIgnoreCase(str);
        System.out.println(palindrome);








    }
}
