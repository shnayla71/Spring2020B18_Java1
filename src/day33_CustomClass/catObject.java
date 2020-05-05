package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class catObject {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.setCatInfo("British","grey",3,"Marko");
        System.out.println(cat1);

        Cat cat2=new Cat();
        cat2.setCatInfo("calico","white",2,"naci");

        ArrayList<Cat> catList=new ArrayList<>();
        catList.addAll(Arrays.asList(cat1,cat2));

        for(int i=0;i<catList.size();i++){
            System.out.println(catList.get(i));

        }

        cat1.sleep();
        cat2.drink("milk");



    }
}
