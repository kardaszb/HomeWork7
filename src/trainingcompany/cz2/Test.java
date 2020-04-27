package trainingcompany.cz2;

import trainingcompany.cz2.model.Address;
import trainingcompany.cz2.model.Student;
import trainingcompany.cz2.model.Trainer;
import trainingcompany.cz2.model.TrainingGroup;

public class Test {
    public static void main(String[] args) {

        Address address = new Address("Warszawa", "Powsinsak", "15a", "33");

        Trainer trainer = new Trainer("Jan", "Kowalski", address);

        Student[] students = new Student[1];
        students[0] = new Student("Jan", "Karolak", address);

        TrainingGroup[] groups = new TrainingGroup[2];
        groups[0] = new TrainingGroup("2B", trainer, students[0], 5);
        groups[1] = new TrainingGroup("1B", trainer, students[0],3);

        System.out.println(students[0].printInfo());
    }
}
