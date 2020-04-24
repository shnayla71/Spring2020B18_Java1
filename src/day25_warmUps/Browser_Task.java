package day25_warmUps;

public class Browser_Task {
    public static String getDriver1(String browser){
        String result="";

        switch(browser.toLowerCase()){
            case "chrome": // if write return instead of result we do not need break
                result="Chrome Driver";break;
            case "firework":result="Firework Driver";break;
            case "safari":result="Safari Driver";break;
            case "opera":result="Opera Driver";break;
            case "edge":result="Edge Driver";break;
            default:result="invalid";
        } return result;
    }
public static String getDriver2(String browser){
         browser=browser.toLowerCase();
         String result="";
         if(browser.equals("chrome")){
             result="Chrome Driver"; // we write return here
         }else if(browser.equals("firefox")){
             result="Firefox Driver";
         }else if(browser.equals("safari")){
             result="Safari Driver";
         }else if(browser.equals("edge")){
             result="Edge Driver";
         }else if(browser.equals("opera")){
             result="Opera Driver";
         }else{ result="invalid driver";}
         return result;
}
public static String getDriver3(String browser){
        browser=browser.toLowerCase();
        String result=(browser.equals("chrome"))? "Chrome Driver":
                (browser.equals("firefox"))? "Firefox Driver":
                        (browser.equals("safari"))? "Safari Driver":
                                (browser.equals("edge"))? "Edge Driver":
                                        (browser.equals("opera"))? "Opera Driver":
                                        "Invalid";

        return result;
}
public static void main(String[] args) {
       String str=getDriver1("chrome");
        System.out.println(str);

        String str1=getDriver2("FirEfoX");
        System.out.println(str1);

        String str2=getDriver3("sAfArI");
    System.out.println(str2);
    }
}
