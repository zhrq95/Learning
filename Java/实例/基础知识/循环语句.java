package 实例.基础知识;

public class 循环语句 {
    public static void main(String[] args) {

        // while 循环
        {
            int x = 1;
            int sum = 0;
            while (x <= 10) {
                sum = sum + x;
                x++;
            }
            System.out.println("sum = " + sum);
        }

        // do while 循环
        {
            int a = 100;
            while (a == 60) {
                System.out.println("OK1");
                a--;
            }
            int b = 100;
            do {
                System.out.println("OK2");
                b--;
            } while (b == 60);
        }

        // for 循环
        {
            int sum = 0;
            for (int i = 2; i <= 100; i += 2) {
                sum = sum + i;
            }
            System.out.println(sum);
        }

        // foreach 语句，int x 引用的变量，arr 指定要循环遍历的数组
        {
            int arr[] = {7, 10, 1};
            System.out.println("数组 arr[] 中的元素分别为：");
            for (int x : arr){
                System.out.println(x);
            }
        }

    }
}