package machine;

public enum TypesOfCoffee {
    ESPRESSO(250, 0, 16, 1, 4),
    LATTE(350, 75, 20, 1, 7),
    CAPPUCCINO(200, 100, 12, 1, 6);

    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int cash;

    TypesOfCoffee(int water, int milk, int coffeeBeans, int cups, int cash) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.cash = cash;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getCups() {
        return cups;
    }

    public int getCash() {
        return cash;
    }
}
