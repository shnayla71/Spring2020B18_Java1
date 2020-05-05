package day34_CustomContinue;

public class Pizza {
    String size;
    int sizePrice;
    int numberOfCheese;
    double numberOfPepperoni;
    double total;

    public void customizeOrder() {
        System.out.println("Pizza size: " + size + "numberOfCheese: " + numberOfCheese + "numberOfPepperoni: " + numberOfPepperoni);

    }

    public void calcCost() {
        System.out.println("your payment: " + total);
        total = sizePrice + numberOfCheese + (1.5 * numberOfPepperoni);
    }

    public String toString() {
        String result="Thank you";
        return result;
    }
    }

