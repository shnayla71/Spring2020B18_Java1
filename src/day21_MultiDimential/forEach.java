package day21_MultiDimential;
import java.util.Arrays;
public class forEach {
    public static void main(String[] args) {
        int[] num={1,2,3,4};
        for(int eachElment:num){
            System.out.println(eachElment);
        }

        String[] students={"muhtar","Asiya","murodil"};
        for(String each:students){
            System.out.println(each);
        }

        int[] arr={1,2,3,4,5,6,7,8,9,10};
       Arrays.sort(arr);// we can add or not
        for(int eachmax:arr) {
            if (eachmax < 5) {
                continue;
            }
            System.out.println(eachmax);
        }

        String sentence="I like Java";//Java like I
        String[] word=sentence.split(" ");// I,like,Java






























    }
}
