package day34_CustomContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetOrder {
    public static void main(String[] args) {

        Carpet[] carpets={new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};
        //System.out.println(carpets[0]); her deger 0
        carpets[0].customOrder(7,8.5,20,true);
        System.out.println(carpets[0]);
        carpets[1].customOrder(3,5,30,false);
        carpets[2].customOrder(6,4,40,true);
        carpets[3].customOrder(2,9,50,true);
        carpets[4].customOrder(5,7,90,false);

        ArrayList<Carpet> persianCarpets=new ArrayList<>();
        for(Carpet eachCarpet:carpets){
            if(eachCarpet.isPersian){
                persianCarpets.add(eachCarpet);
            }
        }
        System.out.println("there are: "+persianCarpets.size());
        System.out.println(persianCarpets.get(0).calcCost());

        ArrayList<Carpet> regularCarpets=new ArrayList<>(Arrays.asList(carpets));
      //  regularCarpets.removeAll(persianCarpets);
         regularCarpets.removeIf(p->p.isPersian);
        System.out.println("there are: "+regularCarpets.size());

       for(int i=0;i<regularCarpets.size();i++) {
           System.out.println(regularCarpets.get(i).calcCost());//sadece total rakami doner
       }


    }
}
