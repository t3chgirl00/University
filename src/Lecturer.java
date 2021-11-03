public class Lecturer{
    private  String name;
    private Subject subject;

    public Lecturer(String name){
        this.name = name;
    }
    public Lecturer(String name, Subject subject){
        this.name = name;
        this.subject = subject;
    }


    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", subject=" + subject +
                '}';
    }

    public String getName() {
        return this.name;
    }
}
