package 实例.类和对象;

class Person{
    String name;
    int age;
    char gender;

    /*
    构造器特点：
    1、方法名与类名一致
    2、方法没有返回值，且没有 void
    3、参数可有可无
    构造器目的：创建对象
    用 new 实例化一个对象时，会调用构造器
    注意：
    如果类中没有带有参数的构造器，就可以使用一个隐藏的默认构造器来创建对象，如 Person p3 = new Person();；
    但一旦有带参数的构造器，默认的构造器就被自定义覆盖了；
    可以显式的定义一个默认构造器，这样就不会被覆盖了。
    */
    public Person (String name, int age){
        System.out.println("创建一个人");
        this.name = name;
        this.age = age;
    }
    // 构造器可以有多个，比如重载
    public Person (char gender){
        System.out.println("重载构造器");
        this.gender = gender;
    }
    // 显式的定义一个默认构造器，以免默认构造器被自定义构造器覆盖
    public Person (){
        System.out.println("默认构造器");
    }
    public Person (String name, int age, char gender){
        this(name, age); // 调用上面第一个构造器，this() 必须在第一行
        this.gender = gender;
    }

    public void introduce(){
        System.out.println("姓名：" + name);
        System.out.println("性别：" + gender);
        System.out.println("年龄：" + age);
    }
}

public class 构造器 {
    public static void main(String[] args){
        Person p1 = new Person("张三", 18);
        p1.introduce();
        System.out.println("----------");
        Person p2 = new Person('男');
        p2.introduce();
        System.out.println("----------");
        // 有构造器后，就不能继续使用默认的无参数构造器
        Person p3 = new Person();
        p3.introduce();
        System.out.println("----------");
        Person p4 = new Person("李四", 20, '男');
        p4.introduce();
    }
}