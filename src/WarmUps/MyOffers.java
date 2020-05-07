package WarmUps;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setInfo("Houston","Apple",120000,true);

        Offer offer2=new Offer();
        offer2.setInfo("Austin","GPA",150000,true);

        Offer offer3=new Offer();
        offer3.setInfo("Atlanta","Chevron",200000,false);

        Offer offer4=new Offer();
        offer4.setInfo("Dallas","ManyCraft",170000,true);

        Offer offer5=new Offer();
        offer5.setInfo("Houston","Shell",180000,false);

        ArrayList<Offer> myOffer=new ArrayList<>();
         myOffer.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5));

         for(int i=0;i<myOffer.size();i++){
             System.out.println(myOffer.get(i));
         }
        myOffer.removeIf(p->!p.isFullTime);
        System.out.println(myOffer);


        myOffer.removeIf(p->p.location=="Houston");
        System.out.println(myOffer);

        myOffer.removeIf(p->p.salary>170000);
        System.out.println(myOffer);

    }
}
