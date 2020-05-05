package day31_BulkOperation;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_retainAll {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5));
        // only keep 1,2,3,4,5

        list.retainAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);   // it delete 6,7,8,9  opposite of remove




    }
}
