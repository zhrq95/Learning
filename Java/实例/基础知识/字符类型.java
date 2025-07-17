package 实例.基础知识;

public class 字符类型 {
    public static void main(String[] args) {
        char word1 = 'd', word2 = '@';
        int p1 = 23045, p2 = 45213;
        System.out.println("d 的 Unicode 码 " + (int)word1);
        System.out.println("@ 的 Unicode 码 " + (int)word2);
        System.out.println("Unicode 码为 23045 的是" + (char)p1);
        System.out.println("Unicode 码为 45213 的是" + (char)p2);
    }
}