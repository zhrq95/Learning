package 实例.字符串;

public class 连接字符串 {
    public static void main(String[] args) {

        // 使用 + 运算符
        String s1 = new String("Hello");
        String s2 = new String("World");
        String s = s1 + " " + s2;
        System.out.println(s);
        // 使用 + 运算符对字符串换行
        System.out.println("I like" +
        "Java");

        // 连接多种数据类型
        int booktime = 4;
        float practice = 2.5f;
        System.out.println("花" + booktime +"小时看书；" + practice + "小时练习。");

    }
}