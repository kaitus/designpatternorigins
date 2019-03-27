package patterns.strategy.example2.controller;

public class payPalAlgorithm implements payment {
    private String email;
    private String password;

    public payPalAlgorithm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(int amout) {
        System.out.println(amout + " paid width payPal!");
    }
}
