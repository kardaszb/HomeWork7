package shop;

public class Director extends Employee {
    private static double BONUS_AMOUNT = 50000;
    private boolean bonus;

    public Director(String firstName, String lastName, Address address, double salary) {
        super(firstName, lastName, address, salary);
    }

    public boolean getBonus() {
        return bonus;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

    double totalPayment() {
        return salary + BONUS_AMOUNT;
    }

    @Override
    public String printInfo() {
        if (getBonus()) {
            return super.printInfo() + " -> (bonus granted) "
                    + "-> salary+bonus=" + totalPayment();
        } else {
            return super.printInfo();
        }
    }

}
