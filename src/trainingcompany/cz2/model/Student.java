package trainingcompany.cz2.model;

import trainingcompany.cz2.logic.Raitings;

public class Student extends Person {
    private Raitings raitings;

    public Student(String firstName, String lastName, Address address) {
        super(firstName, lastName, address);
        this.raitings = new Raitings();
    }

    public void setRaitings(int raiting) {
        raitings.add(raiting);
    }

    @Override
    public String printInfo() {
        return super.printInfo() + raitings.toString();
    }
}
