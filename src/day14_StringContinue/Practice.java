package day14_StringContinue;

public class Practice {
    public static void main(String[] args) {
        String gmail="cybertekschool@gmail.com";
        String ugmail="CybertekSchool@gmail.com";
        gmail.equals(ugmail);//false
        boolean result=gmail.equalsIgnoreCase(ugmail);
        if(result){System.out.println("Logged in");
System.out.println("===================");
 //valid password must be special character(!,_,$);
  //valid password should not contain space
  String PassWord="mmasd1235";
  if(PassWord.contains(" ")){
      System.out.println("Password cannot have space in it");
  }else{System.out.println("valid password");}

   // every website "www." valid or invalid
      String y="www.cybertek.com";
   if(y.startsWith("www.")){System.out.println("valid");}
   else{System.out.println("invalid");}

// every single gmail ends @gmail.com
    String email="CybertekSchool@gmail.com";
   if(email.endsWith("@gmail.com")){System.out.println("valid");}
   else{System.out.println("invalid");

// must start www.
  // must end .com,or .edu, or.net or .Gov

       String mail="http.CybertekSchool.com";
       mail=mail.toLowerCase();
       boolean validending=mail.endsWith(".com")||mail.endsWith(".edu");

       if(mail.startsWith("www.")&& validending){System.out.println("valid");}
   else{System.out.println("invalid");}














}}}}
