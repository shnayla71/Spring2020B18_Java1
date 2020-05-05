package day30_ArrayListContinue;
import java.util.ArrayList;
public class ArrayMethod2 {
    public static void main(String[] args) {
       ArrayList<String> list=new ArrayList<>();
      list.add("A");
      list.add("B");
      list.add("C");


      list.remove(1);
        System.out.println(list);//A,C

        String str="B";
      boolean r1=list.remove(str);
        System.out.println(list);
        System.out.println(r1); //true

     ArrayList<Integer> list2=new ArrayList<>();
     list2.add(1);list2.add(1);list2.add(2);list2.add(3);
    int num1= list2.indexOf(1);// Integer=int only object
        System.out.println(num1);//returns 1 index 0

        int num2=list2.indexOf(6);
        System.out.println(num2);// negative because of indexnumber
    }
}
