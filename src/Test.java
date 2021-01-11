import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file=new File("F:\\a");//转义：\（斜杠slash）本身有作用
        showFile(file);
    }
    /*
    递归：方法调用是在栈中进行
    1、递推
    2、回归
     */
    public static void showFile(File file) {
        if (file.isDirectory()) {//出口
            File files[] = file.listFiles();
            for (File f : files) {
                //开始递归
                showFile(f);
            }
        } else {
            System.out.println(file.getName());
        }
    }
}