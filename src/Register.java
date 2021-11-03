import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import  static  java.util.stream.Collectors.groupingBy;

public class Register {
    private List<? extends  Student> person ;

    public Register(List<? extends Student> nameable) {
        this.person = nameable;
    }

    public List<String> getRegister() {
        List<String> names = person.stream().map(Nameable::getName).collect(Collectors.toList());
        return names;
    }


    public String getRegisterByLevel(Year year) {
        String peopleByLevel = this.person.stream().filter(x ->  x.getYear() == year)
                .map(Nameable::getName).collect(Collectors.toList()).toString();
        return peopleByLevel;
    }

    public Map<Year, List<Student>> getRegisterByLevelGroup(Year year, List<Student> listOfStudent) {
        Map<Year, List<Student>> yearListMap = this.person.stream().collect(groupingBy(Student::getYear));
        return yearListMap;
    }



    public Optional<? extends Student> getStudentByName (String  name) {
        Optional<? extends  Student> studentWithName = Optional.ofNullable(this.person.stream().filter(x -> x.getName()
                .equals(name)).findFirst().orElse(null));

//        System.out.println(studentWithName.getClass().getSimpleName());

        return studentWithName;

    }

    public List<? extends Student> getListOfStudentsByName(List<String> names) {
        List<Student> studentInClass = this.person.stream().filter(x -> names.contains(x.getName())).collect(Collectors.toList());
        return studentInClass;
} }




