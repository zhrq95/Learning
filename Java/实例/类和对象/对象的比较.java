package 实例.类和对象;

public class 对象的比较 {
    public static void main(String[] args) {
        String c1 = new String("abc");
        String c2 = new String("abc");
        String c3 = c2;
        System.out.println(c1.equals(c2)); // equals() 方法比较两个对象的内容是否相等
        System.out.println(c1 == c2);  // == 运算符比较的是两个对象引用的地址是否相等
        System.out.println(c2.equals(c3));
        System.out.println(c2 == c3);

    }
}
