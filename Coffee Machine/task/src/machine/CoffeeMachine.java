package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static int cash = 550;
    private static int water = 400;
    private static int milk = 540;
    private static int coffeeBean = 120;
    private static int amountCup = 9;
    private static boolean exit = true;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (exit) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.nextLine();

            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    System.out.println();
                    state(water, milk, coffeeBean, amountCup, cash);
                    break;
                case "exit":
                    exit = false;
                    break;
                default:
                    System.out.println("Command not recognized. Please try again");
                    break;
            }
        }
    }

    private static void state(int water, int milk, int coffeeBean, int amountCup, int cash) {
        System.out.println("The coffee machine has: \n" + water + " of water\n" + milk + " of milk\n"
                + coffeeBean + " of coffee beans\n" + amountCup + " of disposable cups\n" + cash + " of money");
        System.out.println();
    }

    private static void buy() {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String type = scanner.next();


        switch (type) {
            case "1":
                if (water >= 250 && coffeeBean >= 16 && amountCup >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 250;
                    coffeeBean -= 16;
                    amountCup--;
                    cash += 4;
                    break;
                } else if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (coffeeBean < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else if (amountCup < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                }

            case "2":
                if (water >= 350 && milk >= 75 && coffeeBean >= 20 && amountCup >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    milk -= 75;
                    coffeeBean -= 20;
                    amountCup--;
                    cash += 7;
                    break;
                } else if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (coffeeBean < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else if (amountCup < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                }

            case "3":
                if (water > 200 && milk >= 100 && coffeeBean >= 12 && amountCup >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 200;
                    milk -= 100;
                    coffeeBean -= 12;
                    amountCup--;
                    cash += 6;
                    break;
                } else if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (coffeeBean < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else if (amountCup < 1) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                }

            case "back":
                break;
        }
    }

    private static void fill() {
        System.out.println();
        System.out.println("Write how many ml of water do you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        coffeeBean += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add ");
        amountCup += scanner.nextInt();
        System.out.println();
        //state(water, milk, coffeeBean, amountCup, cash);
    }

    private static void take() {
        System.out.println();
        System.out.println("I gave you $" + cash);
        cash = 0;
    }
}