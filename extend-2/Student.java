package extend1;

public class Student extends Person {
    private String id;

    public Student(int age, String name, String id) {
        super(age,name);
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public static void main(String[] args) {
        Student student = new Student(19,"Tuan","208");
        System.out.println(student.age + " " + student.name + " " + student.id);
    }
}
