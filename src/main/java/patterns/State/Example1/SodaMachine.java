package patterns.State.Example1;

public class SodaMachine {
    final static int SOLD_OUT = 0;
    final static int NO_MONEY = 1;
    final static int HAS_MONEY = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public SodaMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_MONEY;
        }

        System.out.println("Welcome to Soda Machine");
        System.out.println("Inventory is " + count + " Sodas");
        System.out.println("Insert a dollar!!");
    }

    public void insertMoney() {
        if (state == HAS_MONEY) {
            System.out.println("You cant insert another dollar");
        } else if (state == NO_MONEY) {
            state = HAS_MONEY;
            System.out.println("You inser a dollar");
        } else if (state == SOLD_OUT) {
            System.out.println("The machine is SOLDOUT");
        } else if (state == SOLD) {
            System.out.println("Please wait! we are already giving you a soda!");
        }
    }

    public void ejectMoney() {
        if (state == HAS_MONEY) {
            System.out.println("Returning dollar");
            state = NO_MONEY;
        } else if (state == NO_MONEY) {
            System.out.println("You havent insert a dollar");
        } else if (state == SOLD_OUT) {
            System.out.println("Machine sold out");
        } else if (state == SOLD) {
            System.out.println("already selected soda!");
        }
    }

    public void selectSoda() {
        if (state == HAS_MONEY) {
            System.out.println("You selected a soda...");
            state = SOLD;
            dispense();
        } else if (state == NO_MONEY) {
            System.out.println("you selected soda but money first");
        } else if (state == SOLD_OUT) {
            System.out.println("No soda left");
        } else if (state == SOLD) {
            System.out.println("Dispensing your soda.!");
        }
    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println("Dispensing your soda.");
            count -= 1;
            if (count == 0) {
                System.out.println("Sorry, out of soda");
                state = SOLD_OUT;
            } else {
                state = NO_MONEY;
            }
        } else if (state == NO_MONEY) {
            System.out.println("Please insert a dollar");
        } else if (state == SOLD_OUT) {
            System.out.println("Machine sold out");
        } else if (state == HAS_MONEY) {
            System.out.println("No soda dispensed");
        }
    }
}
