import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Register {
    private List<Nameable> person;
    Student student;

//    private List<HasYear> hasYear = new ArrayList<>();
//    private List<Student> student = new ArrayList<>();


    public Register(List<Nameable> nameable) {
        this.person = nameable;
    }

    public List<String> getRegister() {
        List<String> names = person.stream().map(Nameable::getName).collect(Collectors.toList());
        return names;
    }

    public String getRegisterByLevel(Year year) {
        var peopleByLevel = false;
        for (Nameable person : person) {
            if (student.getYear().equals(year)) {
                System.out.println(student.getName());
            }
            else
                return null;

        }
        return student.getName();


    }
}




