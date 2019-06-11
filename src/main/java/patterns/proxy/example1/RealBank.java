package patterns.proxy.example1;

public class RealBank implements Bank {

    public void withDrawMoney(String clientName) throws Exception {
        System.out.println("with draw money ATM...");
    }
}
