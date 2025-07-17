package 实例.字符串;

public class 获取字符串信息 {
    public static void main(String[] args) {

        String str = "We are students";

        // 获取字符串长度
        int size = str.length();
        System.out.println(size);

        // 返回指定字符串首次出现的索引位置
        int find = str.indexOf("a");
        System.out.println(find);

        // 返回指定字符串最后一次出现的索引位置
        int where1 = str.lastIndexOf(" "); // 找空格
        int where2 = str.lastIndexOf(""); // 找字符串结尾符
        System.out.println(where1);
        System.out.println(where2);

        // 获取指定索引位置的字符
        char mychar = str.charAt(5); // 找字符串结尾符
        System.out.println(mychar);
    }
}