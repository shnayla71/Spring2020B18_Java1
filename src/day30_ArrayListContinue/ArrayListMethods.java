package day30_ArrayListContinue;
import java.util.ArrayList;
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);list.add(7);list.add(8);

        list.add(1,6);
        // {4,6,7,8}
        list.set(3,9);// 8 turns 9 {4,6,7,9}
        System.out.println(list);

     // set the element at the index
        int[] arr={1,2,3,4}; //{1,2,3,4,5}
        arr[3]=5;
 ArrayList<String> list2=new ArrayList<>();
list2.add("A");//{A}
list2.add("B");//{A,B}
list2.add(1,"c");//{A,c,B}
list2.add(1,"d");//{A,d,c,B}

        list2.set(3,"f");
        System.out.println(list2);//{A,d,c,f}
 list2.set(2,"e");
        System.out.println(list2);
        System.out.println("=======================");
ArrayList<Integer> list3=new ArrayList<>();
list3.add(1);//0
list3.add(2);//1
list3.add(3);//2
list3.add(4);//3
  int a=1;// for index number we can write directly
 list3.remove(a);//{1,3,4}
        Integer a1=1;
        list3.remove(a1);// it delete object 1
        System.out.println(list3);// {3,4}

     ArrayList<Integer> list4=new ArrayList<>();
       list4.add(10);list4.add(20);list4.add(30);
        int b=1;
        list4.remove(b);
        System.out.println(list4);

        Integer b1=1;
        list4.remove(b1);
        System.out.println(list4);
       boolean r1=list4.remove(b1);// it returns true
        System.out.println(r1);// true

    }
}
