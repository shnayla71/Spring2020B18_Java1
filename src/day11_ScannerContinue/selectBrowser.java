package day11_ScannerContinue;

public class selectBrowser {
    public static void main(String[] args) {
        String browserName="chrome";
        switch (browserName){//break olmazsa hepsi yazar ekranda
            case "chrome"://it means or|| after break it writes same sentence
            case "Chrome":System.out.println("Chrome is opening");break;
            case "firefox":
            case "Firefox":System.out.println("Firefox is opening");break;
            case "safari":
            case "Safari":System.out.println("Safari is opening");break;
            case "opera":
            case "Opera":System.out.println("Opera is opening");break;
            default:System.out.println("invalid browser name!");break;


        }









    }
}
