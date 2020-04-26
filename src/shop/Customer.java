package shop;

public class Customer extends Person {
    protected double totalCost;

    public Customer(String firstName, String lastName, Address address, double totalCost) {
        super(firstName, lastName, address);
        this.totalCost = totalCost;

    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + ", " + "totalCost=" + totalCost;
    }

}
