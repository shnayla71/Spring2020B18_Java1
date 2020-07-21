package Saim_Class;

public class Excepion_Review {
    public static void main(String[] args) {
        try {
            String s = "abc";
            System.out.println(s.charAt(30));

            //  Exception obj=new RuntimeException();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("out of bonus");
        }catch (Exception e){
            System.out.println("general exception");
        } finally {
            System.out.println("final bonus");
        }
    }
}
