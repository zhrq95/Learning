package 实例.字符串;

public class 创建字符串 {
    public static void main(String[] args) {

        // 直接声明字符串变量
        String a1 = "Student";
        String a2 = "Student";
        System.out.println(a1);
        System.out.println(a2);
        // 注：因为 a1，a2 引用相同的字符串常量，所有其内存地址相同

        // String(char a[]) : 通过字符数组创建字符串
        char B[] = {'g', 'o', 'o', 'd'};
        String b = new String(B);
        System.out.println(b);

        // String(char a[], int offset, int length) : 通过字符数组的切片创建字符串
        char C[] = {'s', 't', 'u', 'd','e', 'n', 't'};
        String c = new String(C,2,4);
        System.out.println(c);
    }

}