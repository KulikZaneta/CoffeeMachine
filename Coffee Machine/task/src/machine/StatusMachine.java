package machine;

enum StatusMachine {
    CHOOSE("Write action (buy, fill, take, remaining, exit): "),
    BUY("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: "),
    ENOUGH_RESOURCES("I have enough resources, making you a coffee!"),
    FILL_WATER("Write how many ml of water do you want to add: "),
    FILL_MILK("Write how many ml of milk do you want to add: "),
    FILL_COFFEE_BEANS("Write how many grams of coffee beans do you want to add: "),
    FILL_CUPS("Write how many disposable cups of coffee do you want to add "),
    EXIT("Goodbye!");

    private String message;

    StatusMachine(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}



