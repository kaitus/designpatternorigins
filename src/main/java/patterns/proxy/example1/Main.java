package patterns.proxy.example1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proxy design pattern");

        ProxyBank bank = new ProxyBank();
        try {
            bank.withDrawMoney("Pablo");
            bank.withDrawMoney("XXXX");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
