package 实例.类和对象;

public class 静态变量 {

   static double PI = 3.1415;
   static int id;
   public static void method1(){
       // doSomething
   }
   public void method2(){
       System.out.println(静态变量.PI);
       System.out.println(静态变量.id);
       静态变量.method1();
   }

    public static void main(String[] args) {
        System.out.println(静态变量.PI);
        System.out.println(静态变量.id);
   }
}
