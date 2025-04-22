package Section1.Exercises;

import Section1.Exercises.Entities.Student;

public class ProgramStudent {
    public static void main(String[] args) {
        Student student = new Student("Alex Green",17.00, 20.00, 15.00 );
        student.AproveResult();
        student.FinalGrade();
    }
}
