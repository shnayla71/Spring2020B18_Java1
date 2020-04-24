package day06_Shorthnd_LogicalOperators;

public class SingleifStatement {
    public static void main(String[] args) {
        boolean coldWeather = true;
        if (coldWeather) {
            System.out.println("wear your hat and coat");
        } // if coldweather= false it is not write something

        boolean corona = true;
        if (corona) {
            System.out.println("Buy more papers");
        }
        System.out.println(" ================");
        int a = 97;
        boolean evenNumber = a % 2 == 0 ;
        boolean oddNumber = a % 2 != 0;// !evenNumber instead of oddNumber
        if (oddNumber){ System.out.println(a + " is odd number");}
        if (evenNumber){ System.out.println( a + " is even number");
        }









    }


}