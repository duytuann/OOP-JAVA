package QuanLySinhVien;

public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Constructor 1: ham khoi tao khong tham so.
     */
    Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2: ham khoi tao 3 tham so ko co group.
     */
    Student(String name, String id, String email) {
        this();
        this.name = name;
        this.id = id;
        this.email = email;
    }

    /**
     * Constructor 3: ham khoi tao co tham so la object Student.
     */
    Student(Student s) {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    String getInfo() {
        String s = name + " - " + id + " - " + group + " - " + email;
        return s;
    }
}