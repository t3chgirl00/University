import java.util.HashMap;
import java.util.Map;

public class CourseAndLevel {
    Map<Subject, Level> courseAndLevel = new HashMap<>();
    Subject subject;
    Level level;

    public Map<Subject, Level>  addCourseandLevel(Subject subject, Level level) {
        courseAndLevel.put(subject, level);

        return courseAndLevel;
    }

    @Override
    public String toString() {
        return "CourseAndLevel{" +
                "courseAndLevel=" + courseAndLevel +
                '}';
    }
}
