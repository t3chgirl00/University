import java.util.List;
import java.util.stream.Collectors;

public class NaughtyStudent extends Student{
    public NaughtyStudent(String name, int id, Year year, List<Double> grade) {
        super(name, id, year, grade);
    }

    @Override
    public List<Double> getStudentGrade() {
        return super.getStudentGrade().stream().map((e)-> (e*1.1)).collect(Collectors.toList());
    }

    @Override
    public double getAverageGrade() {
        return super.getAverageGrade()*1.1;
    }


}
