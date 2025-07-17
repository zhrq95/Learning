package 实例.基础知识;

public class 声明常量 {
    static final double PI = 3.14;
    static int age = 23;

    public static void main(String[] args) {
        final int number;
        number = 1235;
        age = 22;
        System.out.println(PI);
        System.out.println(age);
        System.out.println(number);
    }
}