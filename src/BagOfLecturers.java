import java.util.ArrayList;
import java.util.List;

public class BagOfLecturers {
    List<Lecturer> lecturer = new ArrayList<>();


    public void add(Lecturer l) {
        lecturer.add(l);
    }

    public void remove(Lecturer l) {
        lecturer.remove(l);
    }

    public void clear(Lecturer l) {
        lecturer.clear();

    }
}
