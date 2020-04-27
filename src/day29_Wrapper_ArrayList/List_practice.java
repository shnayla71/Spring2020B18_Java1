package day29_Wrapper_ArrayList;
import java.util.ArrayList;
public class List_practice {
    public static void main(String[] args) {
        ArrayList<String> shop=new ArrayList<>();
        shop.add("milk");   // size 1
        shop.add("coffee"); // size 2
        shop.add("bread"); // size 3
        shop.add("eggs");
        System.out.println(shop);
        System.out.println(shop.get(0));// return milk
        for(int i=0;i<3;i++){
    System.out.println(shop.get(i));
}
        System.out.println("===============");
        for(String each:shop){
            System.out.println(each);
        }
// size():
        int size=shop.size();
        System.out.println(size);// give 3

        int lastIndex=shop.size()-1;
        System.out.println(lastIndex);

    }
}
