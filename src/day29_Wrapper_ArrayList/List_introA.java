package day29_Wrapper_ArrayList;
import java.util.ArrayList;
public class List_introA {
    public static void main(String[] args) {
        ArrayList<Integer> scores=new ArrayList<Integer>();

        scores.add(10); //autoboxing
        scores.add(20);
        scores.add(30);
        System.out.println(scores); //size 3

      Integer a1 = scores.get(2);
      int a2=scores.get(2);
      double a3=scores.get(2);

        System.out.println(a1);// 30 all of them






    }
}
