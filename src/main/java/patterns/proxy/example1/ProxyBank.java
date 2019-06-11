package patterns.proxy.example1;

import java.util.ArrayList;

public class ProxyBank implements Bank {

    private RealBank bank = new RealBank();
    private static ArrayList<String> bankClient;

    static {
        bankClient = new ArrayList<String>();
        bankClient.add("XXXX");
        bankClient.add("MCMC");
        bankClient.add("JUJUJU");
    }

    public void withDrawMoney(String clientName) throws Exception {
        if (bankClient.contains(clientName.toUpperCase())) {
            throw new Exception("Access denied");
        }
        bank.withDrawMoney(clientName);
    }
}
