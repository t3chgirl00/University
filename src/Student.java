public class Student implements iNameable{
    private String name;
    private int id;
    private Year year;

   public Student(String name, int id, Year year) {
       this.name = name;
       this.id = id;
       this.year = year;
   }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "{"+
                "Name: " + name +
                ", Id: " + id +
                ", Year: " + year +
                '}';
    }

    public int getId() {
        return id;
    }

    public Year getYear() {
        return year;
    }
}
