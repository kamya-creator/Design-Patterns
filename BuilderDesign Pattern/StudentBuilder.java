package BuilderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {

     String name;
     int id;
     String fatherName;
     String motherName;

     List<String> subject;


    public StudentBuilder setName(String name) {
        this.name = name;
        return this;

    }

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;

    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;

    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setSubject() {
        return this;
    }


    public Student build()
    {
        return new Student(this);
    }
}
