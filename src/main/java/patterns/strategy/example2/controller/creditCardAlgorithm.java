package patterns.strategy.example2.controller;

public class creditCardAlgorithm implements payment {

    private String name;
    private String cardNumber;

    public creditCardAlgorithm(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    public void pay(int amout) {
        System.out.println(amout + " paid width Card!");

    }
}
