package 实例.基础知识;

public class 隐式类型转换 {
    public static void main(String[] args) {
        byte mybyte = 127;
        int myint = 150;
        float myfloat = 452.12f;
        char mychar = 10;
        double mydouble = 45.46546;
        System.out.println(mybyte + myfloat);
        System.out.println(mydouble - mychar);
        System.out.println(mybyte * myint);
        System.out.println(mybyte / mychar);
    }
}