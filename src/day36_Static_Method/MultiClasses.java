package day36_Static_Method;

public class MultiClasses { // AM: public
    public static void main(String[] args) {
        System.out.println("public class");
    }
}
    class Tester{  // AM: default

        public static void main(String[] args) {
            System.out.println("Tester Class");
        }

    }

    class Developer{ // AM: default
        public static void main(String[] args) {
            System.out.println("Developer class");
        }

    }







    class scrumTeam{  // AM: default
        public static void main(String[] args) {
            System.out.println("Scrum Team class");
        }

    }
