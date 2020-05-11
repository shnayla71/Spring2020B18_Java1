package WarmUps;
import java.util.Arrays;
public class replit {
    public static void main(String[] args) {

    int[] i={1,2,3,4};
    int[] arr=new int[i.length];

            arr[0]=i[i.length-1];
            arr[i.length-1]=i[0];
            for(int l=1;l<i.length-1;l++){
                arr[l]=i[l];
            }

            System.out.println(Arrays.toString(arr));
    }
}
