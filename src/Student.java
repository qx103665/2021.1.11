public class Student extends User {

    /*
    成员变量
     */
    private String major;
    private String phone;

    public Student(String major, String phone) {
        super();//调用父类的构造方法
        this.major = major;
        this.phone = phone;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}