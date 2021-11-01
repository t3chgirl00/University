import java.util.List;

public class Course {
    private Lecturer lecturer;
    private List<Student> studentList;
    private Year year;

    public Course(Lecturer lecturer, List<Student> studentList, Year year) {
        this.lecturer = lecturer;
        this.studentList = studentList;
        this.year = year
        ;
    }

    @Override
    public String toString() {
        return "Course{" + lecturer +
                ", studentList=" + studentList +
                ", course level=" + year +
                '}';
    }
}
