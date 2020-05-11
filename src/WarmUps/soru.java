package WarmUps;
import java.util.Scanner;
public class soru {
    public static void main(String[] args) {

                Scanner inp = new Scanner(System.in);
                System.out.print("In:");
                String word = inp.nextLine();
                //DO NOT CHANGE ABOVE CODE!  Write your code below
                if(word.endsWith("y")){
                    System.out.println(word.substring(0,word.length()-1)+"ies");
                }else if(word.endsWith("ey")){
                    System.out.println(word+"s");
                }else if(word.endsWith("ife")){
                    System.out.println(word.substring(0,word.length()-3)+"ives");
                }else{
                    System.out.println(word+"s");
                }


            }
        }



