import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String vowels = "aeiou";
        Lecturer lecturer = new Lecturer("Mrs. Ansah", Subject.INTROTOPROGRAMMING);
        Lecturer lecturer2 = new Lecturer("Mrs. Mensah", Subject.ADVANCEDGARDENING);
        Lecturer lecturer3 = new Lecturer("Mrs. Johnson", Subject.ADVANCEDPHYSICS);

        ArrayList<Student> students = new ArrayList<>(
                List.of(
                new Student("Richard", 1, Year.THIRD),
                new Student("Jerry", 2, Year.FIRST),
                new Student("Ama", 3, Year.SECOND),
                new Student("Selena", 5, Year.THIRD),
                new Student("Abena", 6, Year.FIRST),
                new Student("Kofi", 7, Year.SECOND),
                new Student("Maureen", 8, Year.FOURTH),
                new Student("Edem", 4, Year.FOURTH)

                ));





        Course introToProgramming = new Course(lecturer, students.stream().filter(student -> student.getYear()==Year.FIRST).collect(Collectors.toList()),  Year.FIRST);
        Course advancedGardening = new Course(lecturer2,  students.stream().filter(student -> student.getYear()==Year.THIRD || student.getYear()==Year.FOURTH).collect(Collectors.toList()), Year.FOURTH);
        Course advancedPhysics = new Course(lecturer3, students.stream().filter(student -> student.getYear()==Year.FOURTH && vowels.contains(student.getName().toLowerCase().substring(0, 1))).collect(Collectors.toList()), Year.FOURTH);

        System.out.println(introToProgramming);
        System.out.println(advancedGardening);
        System.out.println(advancedPhysics);




    }
}
