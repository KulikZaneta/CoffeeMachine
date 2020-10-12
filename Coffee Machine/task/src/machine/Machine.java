package machine;

import java.util.Scanner;

public class Machine {
    private int cash = 550;
    private int water = 400;
    private int milk = 540;
    private int coffeeBean = 120;
    private int amountCup = 9;
    private static Scanner scanner = new Scanner(System.in);

    public Machine(int cash, int water, int milk, int coffeeBean, int amountCup) {
        this.cash = cash;
        this.water = water;
        this.milk = milk;
        this.coffeeBean = coffeeBean;
        this.amountCup = amountCup;
    }

    public void command() {
        System.out.println(StatusMachine.CHOOSE.getMessage());
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();
        switch (action) {
            case "buy":
                System.out.println();
                System.out.println(StatusMachine.BUY.getMessage());
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                state();
                break;
            case "exit":
                exit();
                break;
            default:
                System.out.println("Command not recognized. Please try again");
                System.out.println();
                command();
                break;
        }
    }

    private void buy() {
        String type = scanner.next();

        switch (type) {
            case "1":
                checkResources(TypesOfCoffee.ESPRESSO);
                break;
            case "2":
                checkResources(TypesOfCoffee.LATTE);
                break;
            case "3":
                checkResources(TypesOfCoffee.CAPPUCCINO);
                break;
            case "back":
                break;
        }
        command();
    }

    private void checkResources(TypesOfCoffee typesOfCoffee) {
        if (water < typesOfCoffee.getWater()) {
            System.out.println("Sorry, not enough water!");
            System.out.println();
        } else if (milk < typesOfCoffee.getMilk()) {
            System.out.println("Sorry, not enough milk!");
            System.out.println();
        } else if (coffeeBean < typesOfCoffee.getCoffeeBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
            System.out.println();
        } else if (amountCup < typesOfCoffee.getCups()) {
            System.out.println("Sorry, not enough cups!");
            System.out.println();
        } else {
            water -= typesOfCoffee.getWater();
            milk -= typesOfCoffee.getMilk();
            coffeeBean -= typesOfCoffee.getCoffeeBeans();
            amountCup -= typesOfCoffee.getCups();
            cash += typesOfCoffee.getCash();
            System.out.println(StatusMachine.ENOUGH_RESOURCES.getMessage());
            System.out.println();
        }
    }

    private void fill() {
        System.out.println();
        System.out.println(StatusMachine.FILL_WATER.getMessage());
        water += scanner.nextInt();
        System.out.println(StatusMachine.FILL_MILK.getMessage());
        milk += scanner.nextInt();
        System.out.println(StatusMachine.FILL_COFFEE_BEANS.getMessage());
        coffeeBean += scanner.nextInt();
        System.out.println(StatusMachine.FILL_CUPS.getMessage());
        amountCup += scanner.nextInt();
        System.out.println();
        command();
    }

    private void take() {
        System.out.println();
        System.out.println("I gave you $" + cash);
        System.out.println();
        cash = 0;
        command();
    }

    private void state() {
        System.out.println();
        System.out.println("The coffee machine has: \n" + water + " of water\n" + milk + " of milk\n"
                + coffeeBean + " of coffee beans\n" + amountCup + " of disposable cups\n" + "$" + cash + " of money");
        System.out.println();
        command();
    }

    private void exit() {
        System.out.println(StatusMachine.EXIT.getMessage());
        System.exit(0);
    }
}

