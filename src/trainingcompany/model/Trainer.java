package trainingcompany.model;

public class Trainer extends Person {
    private boolean isTrener;

    public Trainer(String firstName, String lastName, Address address) {
        super(firstName, lastName, address);
        this.isTrener = true;
    }

    public boolean isTrener() {
        return isTrener;
    }

    @Override
    public String printInfo() {
        return "\nDane trenera: \n" + super.printInfo();
    }

}