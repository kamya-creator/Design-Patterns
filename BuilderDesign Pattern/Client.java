package BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        StudentBuilder csStudent = new CSStudent();
        Director director = new Director(csStudent);
        Student student = director.createStudent();
        System.out.println(student);

        StringBuilder sb = new StringBuilder();
    }
}
