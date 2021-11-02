import java.util.ArrayList;
import java.util.List;

public  class BagOfStudents extends Bag{
    private List<Student> student = new ArrayList<>();


    public void add(Student s) {
        student.add(s);
    }

    public void remove(Student s) {
        student.remove(s);
    }

    public void clear() {
        student.clear();

    }






}
