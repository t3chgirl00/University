import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Mrs. Ansah", Subject.INTROTOPROGRAMMING);
        Student student = new Student("Mariam", 11, Year.THIRD, List.of(34.6, 78.9, 67.8, 65.7));


        List<Student> studentAndNaughty = new ArrayList<>(
                List.of(
                        new NaughtyStudent("Mariam", 11, Year.THIRD, List.of(34.6, 78.9, 67.8, 65.7)),
                        new Student("Lisa", 12, Year.THIRD, List.of(89.0, 90.0, 96.9, 99.5)),
                        new NaughtyStudent("Alfred", 13, Year.THIRD, List.of(67.9, 34.9, 89.9, 56.2)),
                        new Student("Nortey", 14, Year.THIRD, List.of(67.9, 34.9, 89.9, 56.2)),
                        new NaughtyStudent("Kpakpo", 15, Year.THIRD, List.of(67.9, 34.9, 89.9, 56.2))
                )
        );
        Register register = new Register( studentAndNaughty);


        student.gradesAsDoubleStream();
        register.getStudentByName("aama");





        Course naughtyCourse = new Course(lecturer, studentAndNaughty, Year.THIRD);
//        System.out.println(naughtyCourse);




    }
}
