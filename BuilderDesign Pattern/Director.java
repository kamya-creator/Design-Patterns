package BuilderDesignPattern;

public class Director {

    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder)
    {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent()
    {
        if(studentBuilder instanceof CSStudent)
        {
            Student vinodKumar = studentBuilder.setId(1).setFatherName("Vinod Kumar").build();
            return vinodKumar;
        }
        return null;
    }
}
