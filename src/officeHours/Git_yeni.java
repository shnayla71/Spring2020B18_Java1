package officeHours;

public class Git_yeni {
    public static void main(String[] args) {
        String sentence = "This is a sentence to be reversed";

            sentenceReverser(sentence);
        }
     public static void sentenceReverser(String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--) {
            result += str.charAt(i);

        }
         System.out.println(result);
     }













    }

