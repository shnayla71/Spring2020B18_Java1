package day16_forLoop;

public class taskPractice {
    public static void main(String[] args) {
        String str="aaaabbbbccccdddd";
        String result="";

        for(int i=0;i<=str.length()-1;i++){
         if(result.contains(""+str.charAt(i)))
         {continue;}   result += str.charAt(i);//if the string does not contain str.charAt(i),then concate the result,if it will want
        }System.out.println(result);




    }
}
