package QuanLySinhVien;

public class StudentManagement {

    // khai bao thuoc tinh students la array
    // Student (max. 100)

    static Student[] students = new Student[100];
    static Boolean[] visited = new Boolean[100];
    static int i = 0;

    /**
     * sameGroup.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        }
        return false;
    }

    /**
     * addStudent.
     */
    public void addStudent(Student newStudent) {
        students[i] = new Student();
        students[i] = newStudent;
        visited[i] = false;
        i++;
    }

    /**
     * studentsByGroup.
     */
    public String studentsByGroup() {
        String res = "";
        for (int j = 0; j < i; j++) {
            if (!visited[j]) {
                res = res + students[j].getGroup() + '\n';
                for (int k = j; k < i; k++) {
                    if (students[k].getGroup() == students[j].getGroup() && !visited[k]) {
                        res = res + students[k].getInfo() + '\n';
                        visited[k] = true;
                    }
                }
            }
        }
        if (res != null && res.length() > 0 && res.charAt(res.length() - 1) == '\n') {
            res = res.substring(0, res.length() - 1);
        }
        return res;
    }

    /**
     * binarySearch String.
     */
    public int search(Student[] arr, String target) {
        int left = 0;
        int right = i;
        if (arr[0].getId() == target) {
            return 0;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int check = target.compareTo(arr[mid].getId());
            if (check == 0) {
                return mid;
            }
            if (check > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * remove.
     */
    public void removeStudent(String id) {
        int index = search(students, id);
        if (index == -1) {
            return;
        }
        // 0 1 2 3 4 ~ 2 -> 0 1 3 4 (i = 4);
        for (int j = index; j < i; j++) {
            students[j] = students[j + 1];
        }
        i--;
    }

    public static void main(String[] args) {
        StudentManagement a = new StudentManagement();
        Student hocsinh1 = new Student("Nguyen Van A", "17020001", "17020001@vnu.edu.vn");
        Student hocsinh2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        Student hocsinh3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        Student hocsinh4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        hocsinh1.setGroup("K62CC");
        hocsinh2.setGroup("K62CC");
        a.addStudent(hocsinh1);
        a.addStudent(hocsinh2);
        a.addStudent(hocsinh3);
        a.addStudent(hocsinh4);
        System.out.println(sameGroup(hocsinh1, hocsinh3));
        System.out.println(a.studentsByGroup());
        a.removeStudent("17020001");
        System.out.print(a.studentsByGroup());
    }
}