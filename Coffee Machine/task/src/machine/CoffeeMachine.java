package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);
        int cupOfCoffee = scanner.nextInt();

        int water = 200 * cupOfCoffee;
        int milk = 50 * cupOfCoffee;
        int coffeeBeans = 15 * cupOfCoffee;

        System.out.println("For " + cupOfCoffee + " cups of coffee you will need:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");

    }
}
