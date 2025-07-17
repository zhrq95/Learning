package 实例.类和对象;

class teacher{
    String name;
    int age;
    public void sleep(String name){
        System.out.println(name + "老师在睡觉");
    }
}

class JavaTeacher extends teacher{
    boolean isGlass = true;
    public void teachJava(){
        System.out.println(name + "老师在上 Java 课");
    }
}

class PHPTeacher extends teacher{
    public void teachPHP(){
        System.out.println(name + "老师在上 PHP 课");
    }
    public void playBall(){
        System.out.println("PHP老师会打球");
    }
}

public class 类的继承 {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher();
        jt.name = "张三";
        jt.teachJava();
        System.out.println(jt.isGlass);

        PHPTeacher pt = new PHPTeacher();
        pt.name = "李四";
        pt.sleep("李");
        pt.playBall();
    }
}

/*
    继承的特点：
    1、如果父类中包含了某些类中的共同属性和方法，可以使用继承来设计程序。
        （继承的好处：提高代码的复用性）
    2、子类中用 extends 关键字继承父类的共同属性以外，子类还可以有自己特有的属性和方法。
    3、父类更通用，子类更具体。
    4、子类只能获得父类中的非 private 属性，如果想要继承就得提供公共的 set 和 get 方法。
    5、java 中只能做单继承
    6、java 支持多级继承
 */