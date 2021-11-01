public class Lecturer  implements iNameable{
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

    @Override
    public String getName() {
        return this.name;
    }
}
