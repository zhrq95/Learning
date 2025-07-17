package 实例.类和对象;

public class 方法重载 {

    public static int add(int a, int b){
        return a + b;
    }

    // 参数类型不同，构成重载
    public static double add(double a, double b){
        return a + b;
    }

    // 参数个数不同，构成重载
    public static int add(int a){
        return a;
    }

    public static int add(int a, double b){
        return 1;
    }

    public static int add(double a, int b){
        return 2;
    }

    // 定义不定长参数方法，构成重载
    public static int add(int ...a){
        int s=0;
        for (int i=0; i<a.length; i++)
            s+=a[i];
        return s;
    }

    public static void main(String args[]){
        System.out.println(add(1,2));
        System.out.println(add(1.1,2.2));
        System.out.println(add(5));
        System.out.println(add(1,2.2));
        System.out.println(add(1.1,2));
        System.out.println(add(1,2,3,4,5,6,7,8,9));
    }

}