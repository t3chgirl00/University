import java.util.List;
import java.util.stream.DoubleStream;

public class Student implements Nameable, HasYear {
    private String name;
    private int id;
    private Year year;
    private List<Double> studentGrade;


    public Student(String name, int id, Year year) {
       this.name = name;
       this.id = id;
       this.year = year;
   }

    public int getId() {
        return id;
    }

    public Year getYear() {
        return this.year;
    }

    public Student(String name, int id, Year year, List<Double> studentGrade){
        this.name = name;
        this.id = id;
        this.year = year;
        this.studentGrade = studentGrade;
    }

    public List<Double> getStudentGrade() {
        return studentGrade;
    }

    public double getAverageGrade() {
       double averageGrade = studentGrade.stream().mapToDouble(Double::doubleValue).sum();
       return averageGrade;
    }

    public String getName() {
        return this.name;
    }

    public DoubleStream gradesAsDoubleStream(){
        DoubleStream grades = studentGrade.stream().mapToDouble(Double::doubleValue);
        grades.forEach(System.out::println);
        return grades;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", year=" + year +
                ", studentGrade=" + studentGrade +
                '}';
    }
}
