package trainingcompany.model;

public class TrainingGroup {
    private String groupNo;
    private Trainer trainer;
    private Student[] students;

    public TrainingGroup(String groupNo, Trainer trainer, Student[] students) {
        this.groupNo = groupNo;
        this.trainer = trainer;
        this.students = students;
    }

    private String studentsArrayInfo() {
        String str = "\nDane studentów: \n";
        for (int i = 0; i < students.length; i++) {
            str += students[i].printInfo() + "\n";
        }
        return str;
    }

    public String showInfo() {
        return "Numer grupy: \n" + groupNo + "\n"
                + trainer.printInfo() + "\n"
                + studentsArrayInfo();
    }

}
