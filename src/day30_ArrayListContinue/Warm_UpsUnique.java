package day30_ArrayListContinue;
import java.util.ArrayList;
public class Warm_UpsUnique {
    public static void main(String[] args) {
        /*
         2. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
    3. write a program that can print out the unique elements from an int array
           HINT: store all the unqie elemenbts of array into a list of integers
           Ex: array==> {1,1,2,3,3,4,5}
               output: {2,4,5}
         */
       ArrayList<Integer> list=new ArrayList<>();
       list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
        System.out.println(list);

       ArrayList<Integer> reversedList=new ArrayList<>();
        int size=list.size();
       for(int i=size-1;i>=0;i--){
           int each=list.get(i);
           reversedList.add(each);
       }
        System.out.println(reversedList);
       /*
       for(int j=6;j>=1;j--){
           list.add(j);
       }
        System.out.println(list);
      */

        System.out.println("==================");

       ArrayList<Integer> list1=new ArrayList<>();
       list1.add(1);list1.add(2);list1.add(1);list1.add(3);list1.add(4);


       ArrayList<Integer> uniques=new ArrayList<>();

       for(int i=0;i<list1.size();i++) {
           int count = 0;
           for (Integer each : list1) {
               if (each == list1.get(i)) {
                   count++;
               }
           }
               if (count == 1) {
                   uniques.add(list1.get(i));
               }
           }
        System.out.println(uniques);

        }

    }

