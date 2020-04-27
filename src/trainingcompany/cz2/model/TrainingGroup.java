package trainingcompany.cz2.model;

public class TrainingGroup {
    private String groupNo;
    private Trainer trainer;
    private Student student;

    public TrainingGroup(String groupNo, Trainer trainer, Student student, int studentRating) {
        this.groupNo = groupNo;
        this.trainer = trainer;
        this.student = student;
        this.student.setRaitings(studentRating);
    }

    public String showInfo() {
        return "Numer grupy: \n" + groupNo + "\n"
                + trainer.printInfo() + "\n"
                + student.printInfo();
    }

}
