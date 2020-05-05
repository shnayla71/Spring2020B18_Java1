package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class WarmUp_calis {
    public static void main(String[] args) {
    /*   . write a program that can return the unique objects from a anArray List of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate only and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency == 1)  can keep the unique objects in arrayList
2. write a program that can return the duplicated objects from a an ArrayList of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {1,1,5,5};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. DO NOT use any sort method
			  4. Use predicate and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency > 1)  can keep the duplicated objects in arrayList*/

    /*    ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,4,5,5));
           list.removeIf(y->Collections.frequency(list,y)>1);
           System.out.println(list);*/
        System.out.println("=======================");
        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,2,3,4,5,5));
            list1.removeIf(s->Collections.frequency(list1,s)==1);

        System.out.println(list1);



    }
}
