package extend;

public class Staff extends Person {
    private String school;
    private double pay;

    Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * to string.
     */
    public String toString() {
        String ans = "Staff[";
        ans += super.toString() + ",school=" + school + ",pay=" + pay + "]";
        return ans;
    }
}
