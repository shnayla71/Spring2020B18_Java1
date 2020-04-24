package day02_Variables;

public class VariablesPractice {
    public static void main(String[] args) {
       int salary = 120000;
        double federalTax = 0.18;
        float stateTax = 0.065f;
        // salary after tax= salary(1- sum of taxes)
        double sumTaxes = federalTax + stateTax;

        double salaryAfterTax = salary*(1-sumTaxes);
        System.out.println(salaryAfterTax);

        // area of the circle= r * r * pi
        double r = 5.5;
        double area = r * r * 3.14;
        System.out.println( area );

        double kg = 90;
        double pond = kg * 2.25;
        System.out.println( pond);

        double lira = 1000;
        double liraInDollar = lira/ 6.15;
        System.out.println( liraInDollar);

        double liter = 10000;
        double galons = liter / 3.7;
        System.out.println(galons);
         double liter1 =15;
         double galons1=liter1/ 3.7;
         System.out.println(galons1);
        /* double kg= 20;
         double pound=kg/0.45;
         System.out.println(pound);
          double galon1=10;
          double liter1=galon1*3.7;
          System.out.println(liter1);*/
          double kg1=10;
          double galon=kg1*22.0462;
          System.out.println(galon);






    }






}
