package day14_StringContinue;

public class practice2 {
    public static void main(String[] args) {
        String mail="http.CybertekSchool.com";
        mail=mail.toLowerCase();
        boolean validending=mail.endsWith(".com")||mail.endsWith(".edu");

        if(mail.startsWith("www.")&& validending){System.out.println("valid");}
        else{System.out.println("invalid");}






    }
}
