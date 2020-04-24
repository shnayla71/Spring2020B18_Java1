package day06_Shorthnd_LogicalOperators;

public class warmUp {
    public static void main(String[] args) {
        double litter = 3.785;
        double gallon = litter/ 3.785;
        String result = litter + "litters  is equal to: " + gallon + " gallons";
        System.out.println(result);

        double gallon1 = 3.785;
        double litter1 = gallon1 * 3.785;
        String result1 = gallon1 + " gallon is equal to: "+ litter1 + " litter";
        System.out.println( result1);

System.out.println("=====================");

         int a = 200;
         int b = -a++ + - --a * a-- % 2;
              // -200+ -200 * 200 % 2
         System.out.println(b); // if a write it value = 199 after a--
 System.out.println("=====================");

         int x = 300;
         int y = 400;
         int z = x+ y -x * y + x / y ;  //300/400=0.75 but int accept only 0
         System.out.println(z);
System.out.println("=====================" );








    }

}
