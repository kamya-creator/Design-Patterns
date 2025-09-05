package BuilderDesignPattern;

public class Student {

    private String name;
    private int id;
    private String fatherName;
    private String motherName;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.fatherName =studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.id = studentBuilder.id;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                '}';
    }
}
