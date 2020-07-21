package Saim_Class;

public class User {
    public static void main(String[] args) {
        facebookUser user=new facebookUser("Ayla","pass");
        user.setPassword("Aylapass");// olursa invalid
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println("==============================");

        facebookUser user2=new facebookUser("jamesB","pass007","James Bond");
        System.out.println(user2.getUsername());
        System.out.println(user2.personalurl);
        System.out.println(user2.accountLength);
    }
}
