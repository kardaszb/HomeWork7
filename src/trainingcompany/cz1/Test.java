package trainingcompany.cz1;

import trainingcompany.cz1.model.Address;
import trainingcompany.cz1.model.Student;
import trainingcompany.cz1.model.Trainer;
import trainingcompany.cz1.model.TrainingGroup;

public class Test {
    public static void main(String[] args) {

        Address address = new Address("Warszawa", "Powsinsak", "15a", "33");

        Trainer trainer = new Trainer("Jan", "Kowalski", address);

        Student[] students = new Student[2];
        students[0] = new Student("Jan", "Karolak", address);
        students[1] = new Student("Kamil", "Fasola",address);

        TrainingGroup trainingGroup = new TrainingGroup("2B", trainer,students);

        System.out.println(trainingGroup.showInfo());
    }
}
