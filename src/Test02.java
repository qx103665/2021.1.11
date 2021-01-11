public class Test02 {
    public static void main(String[] args) {
        Student stu=new Student("计算机科学与技术","18076757556");

        stu.setId(123456789);
        stu.setPassword("1111");

        Student stu01=new Student("网络工程","18076757556");

        stu01.setId(987654321);
        stu01.setPassword("2222");

        System.out.println(stu.getPhone());
        System.out.println(stu.getMajor());
    }
}
