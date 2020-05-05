package day34_CustomContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {
      Tester tester1=new Tester();
      tester1.setTesterInfo("Daneyer",365273894,"QA",200.0);

      Tester tester2=new Tester();
      tester2.setTesterInfo("Venera",367258990,"sdet",150.0);

      Tester tester3=new Tester();
      tester3.setTesterInfo("Ayla",12345678,"QA",200.0);

      Tester tester4=new Tester();
      tester4.setTesterInfo("Harika",125367483,"sdet",130.0);

      Tester tester5=new Tester();
      tester5.setTesterInfo("Ayse",24367588,"manual",200.0);

        ArrayList<Tester> testers=new ArrayList<>();
        testers.addAll(Arrays.asList(tester1,tester2,tester3,tester4,tester5));

        testers.removeIf(p->!p.jobTitle.contains("sdet"));
        double totalbudget=0;
        for(Tester each:testers){
            System.out.println(each);
            totalbudget +=each.salary;
        }
        System.out.println(totalbudget);
    }
}
