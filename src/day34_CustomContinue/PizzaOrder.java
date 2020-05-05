package day34_CustomContinue;

public class PizzaOrder {
    public static void main(String[] args) {
        Pizza ayla=new Pizza();
        ayla.size="small";
        ayla.numberOfCheese=1;
        ayla.numberOfPepperoni=2;

        ayla.calcCost();
        ayla.customizeOrder();
    }
}
