package machine;

public class CoffeeMachine {
    public static void main(String[] args) {
        Machine coffeeMachine = new Machine(550, 400, 540, 120, 9);
        coffeeMachine.command();
    }
}