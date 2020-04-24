package day19_Arrays;

public class Email_practice {
    public static void main(String[] args) {

        String[] emails={ "cybertek@yahoo.com","cybertek@gmail.com","cybertek@hotmail.com","cybertek@outlook.com"};

        for(int i=0;i<=3;i++){
         String email=emails[i];
         if(email.endsWith("@gmail.com"))
         System.out.println(email);
        }





    }
}
