package 实例.类和对象;

public class 访问对象的属性和行为 {

    int i = 47;  // 定义成员变量
    // static int i = 47; // 将成员变量设为 static 看看结果
    public void call(){  // 定义成员方法
        System.out.println("调用 call（）方法");
        for (i=0; i<3; i++){
            System.out.println(i + "！");
            if (i==2){
                System.out.println("\n");
            }
        }
    }
    public 访问对象的属性和行为(){}  // 定义构造函数

    public static void main(String[] args) {
        访问对象的属性和行为 t1 = new 访问对象的属性和行为();  // 创建对象 t1
        访问对象的属性和行为 t2 = new 访问对象的属性和行为();  // 创建对象 t2
        t2.i = 60;  // 将类成员变量赋值为 60
        System.out.println("第一个实例对象调用变量i的结果：" + t1.i++); // 使用 t1 调用类成员变量
        t1.call();  // 使用 t1 调用类成员方法
        System.out.println("第二个实例对象调用变量i的结果：" + t2.i); // 使用 t2 调用类成员变量
        t2.call();  // 使用 t1 调用类成员方法
    }
}