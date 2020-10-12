package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int cash = 550;
        int water = 400;
        int milk = 540;
        int coffeeBean = 120;
        int amountCup = 9;

        state(water, milk, coffeeBean, amountCup, cash);

        System.out.println();
        System.out.println("Write action (buy, fill, take): ");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();

        switch (action) {
            case "buy":
                buy(water, milk, coffeeBean, amountCup, cash);
                break;
            case "fill":
                fill(water, milk, coffeeBean, amountCup, cash);
                break;
            case "take":
                take(water, milk, coffeeBean, amountCup, cash);
                break;
            default:
                System.out.println("Command not recognized. Please try again");
        }
    }

    public static void state(int water, int milk, int coffeeBean, int amountCup, int cash) {
        System.out.println("The coffee machine has: \n" + water + " of water\n" + milk + " of milk\n"
                + coffeeBean + " of coffee beans\n" + amountCup + " of disposable cups\n" + cash + " of money");
    }

    public static void buy(int water, int milk, int coffeeBean, int amountCup, int cash) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
        int type = scanner.nextInt();

        switch (type) {
            //espresso
            case 1:
                if (water < 250) {
                    System.out.println("Not enough resources. Please refill water");
                } else if (coffeeBean < 16) {
                    System.out.println("Not enough resources. Please refill coffee beans");
                } else if (amountCup < 1) {
                    System.out.println("Not enough resources. Please refill cups");
                }
                water -= 250;
                coffeeBean -= 16;
                cash += 4;
                break;

            //latte
            case 2:
                if (water < 350) {
                    System.out.println("Not enough resources. Please refill water");
                } else if (milk < 75) {
                    System.out.println("Not enough resources. Please refill milk");
                } else if (coffeeBean < 20) {
                    System.out.println("Not enough resources. Please refill coffee beans");
                } else if (amountCup < 1) {
                    System.out.println("Not enough resources. Please refill cups");
                }
                water -= 350;
                milk -= 75;
                coffeeBean -= 20;
                cash += 7;
                break;

            // cappuccino
            case 3:
                if (water < 200) {
                    System.out.println("Not enough resources. Please refill water");
                } else if (milk < 100) {
                    System.out.println("Not enough resources. Please refill milk");
                } else if (coffeeBean < 12) {
                    System.out.println("Not enough resources. Please refill coffee beans");
                } else if (amountCup < 1) {
                    System.out.println("Not enough resources. Please refill cups");
                }
                water -= 200;
                milk -= 100;
                coffeeBean -= 12;
                cash += 6;
                break;
            default:
                System.out.println("Not recognized. Please enter a valid number");
        }
        amountCup--;
        System.out.println();
        state(water, milk, coffeeBean, amountCup, cash);
    }

    public static void fill(int water, int milk, int coffeeBeans, int amountCup, int cash) {
        System.out.println("Write how many ml of water do you want to add: ");
        Scanner scanner = new Scanner(System.in);
        water += scanner.nextInt();

        System.out.println("Write how many ml of milk do you want to add: ");
        milk += scanner.nextInt();

        System.out.println("Write how many grams of coffee beans do you want to add: ");
        coffeeBeans += scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        amountCup += scanner.nextInt();

        System.out.println();
        state(water, milk, coffeeBeans, amountCup, cash);
    }

    public static void take(int water, int milk, int coffeeBeans, int amountCup, int cash) {
        System.out.println("I gave you $" + cash);
        cash = 0;

        System.out.println();
        state(water, milk, coffeeBeans, amountCup, cash);
    }
}