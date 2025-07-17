package 实例.基础知识;

public class 显式类型转换 {
    public static void main(String[] args) {
        int a = (int)45.23;
        long b = (long)456.6F;
        int c = (int)'d';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}