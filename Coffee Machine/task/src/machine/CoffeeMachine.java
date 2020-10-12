package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int amountWater = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int amountMilk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has::");
        int amountCoffeeBeans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cupOfCoffee = scanner.nextInt();


        int waterCups = amountWater / 200;
        int milkCups = amountMilk / 50;
        int beansCups = amountCoffeeBeans / 15;

        int limit = Math.min(waterCups, Math.min(milkCups, beansCups));

        if (cupOfCoffee > limit) {
            System.out.println("No, I can make only " + limit + " cup(s) of coffee");
        } else if (cupOfCoffee == limit) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            int extra = limit - cupOfCoffee;
            System.out.println("Yes, I can make that amount of coffee (and even " + extra + " more than that)");
        }
    }
}
