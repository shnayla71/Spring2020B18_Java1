package day06_Shorthnd_LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean result1 = true;
        System.out.println(!true);// prints false

        boolean result2 = !(10+15 > 15);// returns false

        boolean r1 = "Corona virus" != "End of the world";
        System.out.println(r1);

        boolean s = 10> 15 && 15<13;
        System.out.println(s);

        boolean r4 = true != false || false== !true;
        System.out.println(r4);
        // !!!!!!false mean true  ! tek sayi ise tersi cift sayi ise ayni yazicak
        // !!! false = !! true =! false = true












    }
}
