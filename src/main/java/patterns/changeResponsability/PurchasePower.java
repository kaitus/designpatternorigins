package patterns.changeResponsability;

abstract class PurchasePower {

    protected static final double BASE = 1000;
    protected PurchasePower succesor;

    abstract  protected double getAllowble();
    abstract  protected String getRole();

    public void setSuccessor(PurchasePower succesor) {
        this.succesor = succesor;
    }

    public PurchasePower getSuccesor() {
        return succesor;
    }

    public void proccessRequest(PurchaseRequest request) {
        if (request.getAmount() < this.getAllowble()) {
            System.out.println(this.getRole() + " will aprove $" + request.getAmount());
        } else if (succesor != null) {
            succesor.proccessRequest(request);
        }
    }
}
