package inheritance;

public class Main {

    public static void main(String[] args) {
        CaffeineBeverage beverage = new Coffee();

        if (beverage instanceof Coffee) {
            Coffee coffee = (Coffee) beverage;
        }
    }
}
